package com.ahxugang.springcloud_client2.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("springcloud-client1")
public interface Service1FeignClient {
	
    @RequestMapping("/hello")
    public String hello();
}
