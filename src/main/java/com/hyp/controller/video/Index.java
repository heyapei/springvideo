package com.hyp.controller.video;


import com.hyp.dataobject.blog.ResourceUrl;
import com.hyp.service.VideoImgService;
import com.hyp.vo.returnmsg.MyError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/14 13:08
 * @Description: TODO
 */
@Component("videoimgindex")
@Controller
@RequestMapping("/videoimg")
@Slf4j
public class Index {

    @Autowired
    private VideoImgService videoImgService;


    @RequestMapping(value = "")
    public String index() {
        return "forward:/videoimg/videoimglist";
    }


    /*@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String myIndex() {
        return "videoImg/index";
    }*/


    @RequestMapping(value = "/videoimglist", method = RequestMethod.GET)
    public String videoImgList(ModelMap map) {

        List<ResourceUrl> videoImgs = videoImgService.getVideoImgs();

        log.info("查询结果：" + videoImgs != null ? videoImgs.toString() : "");
        map.put("videoImgs", videoImgs);
        return "videoImg/videoImgList";
    }


    @RequestMapping(value = "/showvideo")
    public String showVideo(
            @RequestParam Integer videoId,
            @RequestParam String passWord, ModelMap map) {
        ResourceUrl videoImgById = videoImgService.getVideoImgById(videoId);
        if (videoImgById == null) {
            log.info("做密码验证的时候查询出来空值了");
            MyError myError = new MyError(500, "No have Video", "The video you want is not found. The resource may have been deleted by the administrator");
            map.put("myError", myError);
            return "myError/error";
        } else {
            if (!videoImgById.getPassWord().equals(passWord)) {
                log.info("密码验证错误");
                MyError myError = new MyError(500, "Password ERROR", "You need to make sure your video password is correct");
                map.put("myError", myError);
                return "myError/error";

            }
        }

        map.put("videoImg", videoImgById);

        /*添加观看人次*/
        videoImgService.addViewNum(videoId);

        return "videoImg/videoPlay";
    }


}
