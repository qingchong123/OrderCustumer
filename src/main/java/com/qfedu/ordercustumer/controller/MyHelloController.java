package com.qfedu.ordercustumer.controller;

import com.qfedu.ordercustumer.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHelloController {

    @Autowired
    private Hello hello;

    @GetMapping("/hello.do")
    public String hello12(){
        return hello.h1();
    }
}
