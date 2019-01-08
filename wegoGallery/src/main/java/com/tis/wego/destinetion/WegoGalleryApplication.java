package com.tis.wego.destinetion;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*This module starting point deals with mapping end points
 * Improving to identify land marks Geographic start location and destination 
 * mostly at this point of time ,i think i am not storing any data related to journey 
 * Later point of time i might use to store latitude end points which can save more space.
 * */ 
@EnableDiscoveryClient
@SpringBootApplication
public class WegoGalleryApplication {

	private static Logger _logger = Logger.getLogger(WegoGalleryApplication.class.getName());
	public static void main(String[] args) {
	_logger.info("::::   WegoGalleryApplication ::::  This module deals with Destinetion and mapping end points ");
	SpringApplication.run(WegoGalleryApplication.class, args);
	}

}

