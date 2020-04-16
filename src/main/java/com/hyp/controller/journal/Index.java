package com.hyp.controller.journal;

import com.hyp.dataobject.Journal;
import com.hyp.service.JournalService;
import com.hyp.utils.FileNameUtils;
import com.hyp.utils.FileUtils;
import com.hyp.vo.MyError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/15 9:20
 * @Description: TODO
 */
@Component("journalindex")
@Controller
@RequestMapping("/journal")
@Slf4j
public class Index {

    @Autowired
    private JournalService journalService;

    @RequestMapping(value = "")
    public String index() {
        return "forward:/journal/showlist";
    }


    @RequestMapping(value = "/showlist", method = RequestMethod.GET)
    public String showJournalList(ModelMap map) {
        List<Journal> journals = journalService.getJournals();
        log.info("查询结果：" + journals != null ? journals.toString() : "");
        map.put("journals", journals);

        return "journal/journalList";
    }


    @RequestMapping(value = "/showjournal")
    public String showJournal(@RequestParam String passWord, @RequestParam Integer journalId, ModelMap map) {
        Journal journal = journalService.getJournalById(journalId);
        if (journal == null) {
            log.info("做密码验证的时候查询出来空值了");
            MyError myError = new MyError(500, "No have Journal", "The Journal you want is not found. The resource may have been deleted by the administrator");
            map.put("myError", myError);
            return "myError/error";
        } else {
            if (!journal.getPassWord().equals(passWord)) {
                log.info("密码验证错误");
                MyError myError = new MyError(500, "Password ERROR", "You need to make sure your journal password is correct");
                map.put("myError", myError);
                return "myError/error";
            }
        }

        map.put("journal", journal);

        /*添加观看人次*/
        journalService.addViewNum(journalId);


        return "journal/showJournal";
    }


    @RequestMapping(value = "/journaleditor", method = RequestMethod.GET)
    public String journalEditorPage() {

        return "wangEditor/wangEditor";
    }

    @ResponseBody
    @RequestMapping(value = "/imgUpload", method = RequestMethod.POST)
    public Map<String, String> upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
// /D:/LifeSpace/IdeaWorkSpace/springstart/target/classes/uploadImg

        String runtimePath = getRuntimePath();
        String IMG_PATH_PREFIX = "static/upload/imgs";
        String fileDirPath = runtimePath + IMG_PATH_PREFIX;
        log.info("项目地址：" + fileDirPath);
        File imgDirFile = FileUtils.getImgDirFile(fileDirPath);
        URL url = null;
        try {
            url = imgDirFile.toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        log.info("通过file获取的url是：" + url);
        String urlString = url.toString();
        String urlTemp = urlString.substring(urlString.lastIndexOf("file:/") + 6);
        log.info("截取出来的路径：" + urlTemp);
        // D:/LifeSpace/IdeaWorkSpace/springstart/target/classes/uploadImg
        String savePath = urlTemp;
        // 获得文件类型 image/jpeg
        String fileType = file.getContentType();
        // 获得文件后缀名称 jpeg
        String imageName = fileType.substring(fileType.indexOf("/") + 1);
        // 原名称 test.jpg
        String fileName = file.getOriginalFilename();
        //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
        //处理获取到的上传文件的文件名的路径部分，只保留文件名部分 test.jpg
        String filename = fileName.substring(fileName.lastIndexOf("\\") + 1);
        //得到文件保存的名称 f1a315ae4b7a4c81b5cf1cb396fbfdd2_test.jpg
        String saveFilename = new FileNameUtils().makeFileName(filename);
        //得到文件的保存目录  D:/LifeSpace/IdeaWorkSpace/springstart/target/classes/uploadImg/12/1
        //不存储的太深了
        String realSavePath = savePath;
        try {
            FileUtils.upload(file.getBytes(), realSavePath, saveFilename);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //获得保存到数据库的信息

        // 拼接图片url
        String imgPath = "//" + request.getServerName().replace("/", "") + ":" + request.getServerPort() + "/" + IMG_PATH_PREFIX + "/" + saveFilename;
        Map<String, String> map = new HashMap<>(1);
        map.put("url", imgPath);
        return map;
    }


    /**
     * 获取当前类的运行路径
     * file:/D:/IdeaWorkSpace/springstart/target/classes/ 就相当于是获取了当前类的运行路径
     * @return
     */
    private static String getRuntimePath() {
        String classPath = Index.class.getName().replaceAll("\\.", "/") + ".class";
        URL resource = Index.class.getClassLoader().getResource(classPath);
        if (resource == null) {
            return null;
        }
        String urlString = resource.toString();
        int insidePathIndex = urlString.indexOf('!');
        boolean isInJar = insidePathIndex > -1;
        if (isInJar) {
            urlString = urlString.substring(urlString.indexOf("file:"), insidePathIndex);
            return urlString;
        }
        return urlString.substring(urlString.indexOf("file:"), urlString.length() - classPath.length());
    }



}
