package com.anfeis.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/hello")
    public String HelloSpring(){
        return "hello spring .....11111";
    }
}
