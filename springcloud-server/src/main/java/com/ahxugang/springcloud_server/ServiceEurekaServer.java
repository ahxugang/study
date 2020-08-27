package com.ahxugang.springcloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurekaServer.class, args);
	}
}
