package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoAppApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }
    
}
