package com.lj.cloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudProviderApplication {

    @GetMapping("/hello")
    public String hello(){
        return "1";
    }
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderApplication.class, args);
    }

}
