package com.qfedu.ordercustumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient   //客户端
@EnableFeignClients   //基于Feign服务调用
@EnableDiscoveryClient //发现服务
public class OrdercustumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdercustumerApplication.class, args);
    }

}

