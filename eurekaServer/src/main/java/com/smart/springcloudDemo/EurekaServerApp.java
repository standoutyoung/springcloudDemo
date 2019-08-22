package com.smart.springcloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!-->>你好，世界" );
        SpringApplication.run(EurekaServerApp.class,args);
    }
}
