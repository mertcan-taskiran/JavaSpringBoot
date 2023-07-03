package com.mertcantaskiran.controller;

import com.mertcantaskiran.bean.BeanConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class BeanController {
    @Autowired
    BeanConfig beanConfig;

    @GetMapping("/bean/beanDto") // url
    @ResponseBody // html olmadan ekranda göster
    public String getBeanDto(){
        return beanConfig.beanDto()+"";
    }
}
