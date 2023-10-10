package com.services.employee.WebClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class EmployeeServicePrj5WebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServicePrj5WebClientApplication.class, args);
		System.out.println("Web Client Employee Services");
	}
	@Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
