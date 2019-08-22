package com.smart.springcloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProvider2001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider2001.class,args);
    }
}
