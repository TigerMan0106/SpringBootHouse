package com.shsxt.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello springboot";
    }
    @RequestMapping("freemarker")
    public String freemarker(){
        return "index";
    }

    @RequestMapping("thymeleaf")
    public String thymeleaf(HttpServletRequest request){
        request.setAttribute("msg","hello");
        return "thymeleaf";
    }
}
