package com.lj.cloudeureka8760;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEureka8760Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka8760Application.class, args);
    }

}
