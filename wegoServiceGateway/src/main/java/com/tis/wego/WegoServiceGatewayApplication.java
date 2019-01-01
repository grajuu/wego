package com.tis.wego;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WegoServiceGatewayApplication {

	private static Logger _logger = Logger.getLogger(WegoServiceGatewayApplication.class.getName());
	
	public static void main(String[] args) {
		_logger.info("  :::::  This will be act as API gatway ::::  ");
		SpringApplication.run(WegoServiceGatewayApplication.class, args);
		
		
	}

}

