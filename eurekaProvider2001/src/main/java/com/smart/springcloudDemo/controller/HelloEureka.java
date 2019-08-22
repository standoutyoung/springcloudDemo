package com.smart.springcloudDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEureka {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public String hello(){
        String eurekaInfo="hello,nice to meet you,"+discoveryClient.getServices();
        System.out.println(eurekaInfo);
        return eurekaInfo;
    }
}
