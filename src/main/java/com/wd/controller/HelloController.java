package com.wd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {

        System.out.println("Hello world 1234569");

        return "success2547899";
    }
}
