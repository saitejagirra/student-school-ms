package com.school.student.discoverymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoverymicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverymicroserviceApplication.class, args);
	}

}
