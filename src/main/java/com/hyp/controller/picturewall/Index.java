package com.hyp.controller.picturewall;

import com.hyp.dataobject.blog.PictureWall;
import com.hyp.service.PictureWallService;
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
 * @Date 2020/4/15 16:23
 * @Description: TODO
 */
@Component("picturewallindex")
@Controller
@RequestMapping("/picturewall")
@Slf4j
public class Index {

    @Autowired
    private PictureWallService pictureWallService;


    @RequestMapping(value = "")
    public String index() {
        return "forward:/picturewall/showpicture";
    }


    @RequestMapping(value = "/showpicture", method = RequestMethod.POST)
    public String showJournalList(@RequestParam String passWord, ModelMap map) {

        List<PictureWall> pictureWallByPassWord = pictureWallService.getPictureWallByPassWord(passWord);
        if (pictureWallByPassWord == null) {
            log.info("做密码验证的时候查询出来空值了");
            MyError myError = new MyError(500, "No have picture", "Your permission may have expired or the image resource has been deleted by the administrator");
            map.put("myError", myError);
            return "myError/error";
        }
        map.put("pictureWalls", pictureWallByPassWord);

        return "pictureWall/showPicture";
    }
}
