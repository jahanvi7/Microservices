package com.cognizant.cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CartApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(CartApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Inside main");
		SpringApplication.run(CartApplication.class, args);

	}

}