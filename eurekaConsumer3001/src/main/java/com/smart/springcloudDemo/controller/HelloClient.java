package com.smart.springcloudDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloClient {
    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_PRE="http://EUREKAPROVIDER2001";
//    private static final String URL_PRE="http://localhost:2001";

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("helloC")
    public String helloClient(){
        System.out.println(discoveryClient.getServices());
        return restTemplate.getForObject(URL_PRE+"/hello",String.class);
    }
}
