package com.tako.devtako.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funclip")
public class FunclipController {

    @GetMapping("")
    public String home(){
        return "funclip/home";
    }

}
