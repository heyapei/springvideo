package com.hyp.controller.api.weixin.vote;

import com.hyp.dataobject.weixin.vote.WeixinMusic;
import com.hyp.vo.returnmsg.MyError;
import com.hyp.vo.returnmsg.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/5/21 21:37
 * @Description: TODO
 */
@Component("voteController")
@RestController
@RequestMapping("/vote")
@Slf4j
public class VoteController {

    @PostMapping
    public MyError index() {
        MyError myError = new MyError(1, "fsf", "你好中国");
        return myError;
    }

    @GetMapping
    public Result index1() {

        return Result.success(new WeixinMusic(1, "轻音乐", 1, "http://fsdff.com", 1, "love", "这是一首轻音乐"));
    }


}
