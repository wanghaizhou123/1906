package com.mr.whz.com.mr.whz.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName MrSwagger2Config
 * @Description: TODO
 * @Author wanghaizhou
 * @Date 2019/12/17
 * @Version V1.0
 **/
@Controller
public class RediRectController {

    @GetMapping(value = "/")
    public String toIndex(){

        return "demo";
    }

    @GetMapping(value = "mei")
    public String tomeigui(){

        return "meigui";
    }
}