package com.yixing.splib;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan(value = "com.yixing.splib.dao")
//extends SpringBootServletInitializer
public class SplibApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SplibApplication.class, args);
    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SplibApplication.class);
//    }
}
