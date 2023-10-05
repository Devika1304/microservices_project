package com.services.department.DepartmentServicesPrj5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(basePackages = { "com.*"})
@EnableCaching
@Configuration
@SpringBootApplication
public class DepartmentServicesPrj5Application {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServicesPrj5Application.class, args);
		System.out.println("Department Service");
	}

}
