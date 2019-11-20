package com.lj.cloudconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

//    private static String Default_URL = "http://localhost:8001";
    private static String Default_URL = "http://CLOUDPROVIDE";

    private Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/hello")
    public String test(){
        return restTemplate.getForObject(Default_URL+"/hello",String.class);
    }

    @GetMapping("/demo")
    public String demo(String str){
        logger.info("str:"+str);
        return restTemplate.getForObject(Default_URL+"/demo?str="+str,String.class);
    }

}
