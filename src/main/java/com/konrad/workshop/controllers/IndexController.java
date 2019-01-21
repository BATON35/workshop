package com.konrad.workshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/fd")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/services.html")
    public String getSevrices(){
        return "services";
    }
}
