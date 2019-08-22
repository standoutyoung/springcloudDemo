package com.smart.springcloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp1001
{
    public static void main( String[] args )
    {
        System.out.println( "Hello EurekaServerApp1001!" );
        SpringApplication.run(EurekaServerApp1001.class,args);
    }
}
