package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoRegistryApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoRegistryApplication.class, args);
    }
    
}
