package com.mertcantaskiran.controller;

import com.mertcantaskiran.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model){
        model.addAttribute("key_model", "Ben modelden geldim");
        return "thymeleaf4";
    }

    // Model object gönderme
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5ModelObject(Model model){
        model.addAttribute("key_model1", "text");
        List<ProductDto> listem = new ArrayList<>();
        listem.add(ProductDto.builder().productId(0l).productName("Ürün adı").productPrice(2500).build());
        //model.getAttribute("product_liste", listem);
        return "thymeleaf5";
    }
}
