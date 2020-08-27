package com.ahxugang.springcloud_client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Service1FeignClient server1FeignClient;

    @RequestMapping("/call")
    public String call() {
        String result = server1FeignClient.hello();
        return "b to a 访问结果 ----- " + result;
    }
}
