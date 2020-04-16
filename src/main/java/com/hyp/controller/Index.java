package com.hyp.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/14 13:08
 * @Description: TODO 进入默认首页
 */
@Controller
@RequestMapping("/")
@Slf4j
public class Index {


    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
