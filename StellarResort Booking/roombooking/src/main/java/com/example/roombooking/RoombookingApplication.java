package com.example.roombooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
public class RoombookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoombookingApplication.class, args);
	}

}
