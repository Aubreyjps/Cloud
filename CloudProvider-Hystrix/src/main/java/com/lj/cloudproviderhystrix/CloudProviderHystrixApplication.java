package com.lj.cloudproviderhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@EnableCircuitBreaker//开启hystrix
public class CloudProviderHystrixApplication {

    @GetMapping("/hello")
    public String hello() {
        return "1";
    }

    @GetMapping("/demo")
    @HystrixCommand(fallbackMethod = "thisDemo")
    public String demo(String str){
        if(str.equals("false")){
            //当出现异常时调用thisDemo方法
            throw new RuntimeException("超时");
        }
        return "true";
    }

    public String thisDemo(String str) {
        return "demo";
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixApplication.class, args);
    }

}
