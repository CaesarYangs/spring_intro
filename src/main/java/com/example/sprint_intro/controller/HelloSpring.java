package com.example.sprint_intro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpring {

    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "Hello Spring Boot";
    }
}
