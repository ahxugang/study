package com.ahxugang.springcloud_client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceEurekaClient2 {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurekaClient2.class, args);
	}
}
