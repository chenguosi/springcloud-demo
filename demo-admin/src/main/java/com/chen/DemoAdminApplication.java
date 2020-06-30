package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoAdminApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoAdminApplication.class, args);
    }
    
}
