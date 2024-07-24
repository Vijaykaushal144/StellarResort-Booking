package com.example.userapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserapplicationApplication.class, args);
	}

}
