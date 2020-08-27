package com.ahxugang.springcloud_client1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
