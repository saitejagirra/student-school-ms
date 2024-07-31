package com.school.ms.schoolmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SchoolmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmicroserviceApplication.class, args);
	}

}
