package com.cognizant.menuItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MenuItemApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MenuItemApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Inside main");
		SpringApplication.run(MenuItemApplication.class, args);

	}

}