package com.yixing.splib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class ThymeleafController {

    @RequestMapping("index")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "hello";
    }
}