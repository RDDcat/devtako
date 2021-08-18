package com.tako.devtako.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/amenews")
public class AmenewsController {

    @GetMapping("")
    public String home(){
        return "amenews/home";
    }

}
