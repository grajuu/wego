package com.tis.wego.people;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/*
 * This will maintain the number of people or friends
 * participate in the event 
 *  */

@EnableCircuitBreaker
//@EnableBinding(Source.class)
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class WegoTimeApplication {

	private static Logger _logger = Logger.getLogger(WegoTimeApplication.class.getName());
	
	public static void main(String[] args) {
		_logger.info(":::::  WegoTimeApplication Started ::::   ");
		SpringApplication.run(WegoTimeApplication.class, args);
	}

}

