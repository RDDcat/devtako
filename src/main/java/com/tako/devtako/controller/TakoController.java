package com.tako.devtako.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TakoController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
