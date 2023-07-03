package com.mertcantaskiran.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {

    @Autowired
    Logger LOG;

    //public PostConstructTutorials() {
    //    LOG.info("Log info çağrıldı.");
    //}

    @PostConstruct
    public void init(){
        LOG.info("Log info çağrıldı.");
    }

    public static void main(String[] args) {
        PostConstructTutorials postConstructTutorials = new PostConstructTutorials();
        System.out.println(postConstructTutorials);
    }
}
