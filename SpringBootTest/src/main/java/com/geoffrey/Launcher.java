package com.geoffrey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan
@EnableAutoConfiguration
public class Launcher extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(Launcher.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Launcher.class);
    }

    public static void main(String[] args) {
        logger.info("=================SpringBoot启动===================");
        SpringApplication.run(Launcher.class, args);
    }

}
