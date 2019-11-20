package com.li.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloudprovide")
public interface FeignService {

    @GetMapping("/hello")
    public String hello();

    @GetMapping("/demo")
    public String demo(@RequestParam("str") String str);
}
