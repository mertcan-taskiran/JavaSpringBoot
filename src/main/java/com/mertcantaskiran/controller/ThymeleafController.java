package com.mertcantaskiran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {
    @GetMapping("/thymeleaf1")
    //@ResponseBody
    public String getThymeleaf1(){
        return "thymeleaf1";
    }

    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model){
        model.addAttribute("key_model", "Ben modelden geldim");
        return "thymeleaf1";
    }

    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model){
        model.addAttribute("key_model", "Ben modelden geldim");
        return "thymeleaf_file/thymeleaf3";
    }
}
