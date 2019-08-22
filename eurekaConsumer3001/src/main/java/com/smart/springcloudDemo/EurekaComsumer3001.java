package com.smart.springcloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 * 你好
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaComsumer3001
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaComsumer3001.class,args);
    }
}
