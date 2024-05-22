package com.svb.springbootdockerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Docker";
    }
}
