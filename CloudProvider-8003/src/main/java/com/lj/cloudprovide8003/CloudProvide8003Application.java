package com.lj.cloudprovide8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudProvide8003Application {

    @GetMapping("/hello")
    public String hello(){
        return "3";
    }
    public static void main(String[] args) {
        SpringApplication.run(CloudProvide8003Application.class, args);
    }

}
