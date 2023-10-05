package com.employee.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class EmployeeServiceWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceWebClientApplication.class, args);
		System.out.println("Employee Webclient");
	}
	@Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
