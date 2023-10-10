package com.services.employee.EmployeeServicesPrj5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = { "com.*"})
@EnableCaching
@Configuration
public class EmployeeServicesPrj5Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServicesPrj5Application.class, args);
		System.out.println("Employee Services git commit");
	}
	
	  @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }
	
}
