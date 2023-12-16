package com.example.alaki.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnThreading;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/login")
    public String login(){
        return  "login";
    }
}
