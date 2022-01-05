package com.myapp.root.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyAppController {
    
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello end point is triggered";
    }

    @GetMapping("/login")
    public String login() {
        return "login end point is triggered";
    }
    
}
