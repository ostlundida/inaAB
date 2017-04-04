package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ida on 2017-04-03.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(){
        return "index";
    }

    @RequestMapping("/test")
    public String showTestPage(){
        return "test";
    }
}
