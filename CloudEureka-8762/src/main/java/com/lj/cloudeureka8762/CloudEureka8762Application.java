package com.lj.cloudeureka8762;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEureka8762Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka8762Application.class, args);
    }

}
