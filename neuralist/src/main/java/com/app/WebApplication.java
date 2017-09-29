package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.neuralist.controller"})
public class WebApplication {

 public static void main(String[] args) throws Exception {
 SpringApplication.run(WebApplication.class, args);
 }

}