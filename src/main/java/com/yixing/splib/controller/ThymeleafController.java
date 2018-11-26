package com.yixing.splib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller

public class ThymeleafController
{

    @RequestMapping("/")
    public String hello(Map<String, Object> map)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        map.put("msg", df.format(new Date()));
        return "hello";
    }
}