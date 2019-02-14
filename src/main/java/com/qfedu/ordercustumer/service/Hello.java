package com.qfedu.ordercustumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("orderprovider")
public interface Hello {
    @GetMapping("hellofirst.do")
    public String h1();
    int i = 1;
}
