package com.tis.wego.people;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 * This will maintain the number of people or friends
 * participate in the event 
 *  */
@EnableDiscoveryClient
@SpringBootApplication
public class WegoPeopleApplication {

	private static Logger _logger = Logger.getLogger(WegoPeopleApplication.class.getName());
	
	public static void main(String[] args) {
		_logger.info(":::::  WegoPeopleApplication Started ::::   ");
		SpringApplication.run(WegoPeopleApplication.class, args);
	}

}

