package com.lj.cloudconsumerfeign.controller;

import com.li.service.FeignService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hello")
    public String hello(){
        return feignService.hello();
    }

    @GetMapping("/demo")
    public String demo(String str){
        LoggerFactory.getLogger(FeignController.class).info("str:"+str);
        return feignService.demo(str);
    }
}
