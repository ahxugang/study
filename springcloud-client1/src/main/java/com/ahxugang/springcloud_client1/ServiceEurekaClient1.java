package com.ahxugang.springcloud_client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceEurekaClient1 {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurekaClient1.class, args);
	}
}
