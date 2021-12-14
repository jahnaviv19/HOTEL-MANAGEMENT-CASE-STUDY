package com.DepartmentMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DepartmentMicroservicesApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DepartmentMicroservicesApplication.class, args);
	}
	
}
