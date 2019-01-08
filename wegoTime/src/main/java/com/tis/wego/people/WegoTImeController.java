/**
 * 
 */
package com.tis.wego.people;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author mardubudi
 *
 */

@RestController
public class WegoTImeController {
	
	private static Logger _logger = Logger.getLogger(WegoTImeController.class.getName());
	
@Value(value = "{info}")	


@HystrixCommand(fallbackMethod ="fallBack")
@GetMapping("/info/{info}")
public String getInfo(@PathVariable("info") String info) {
	_logger.info("::::  WegoTImeController This is WeGo Time Service Edge ::::");
	
	return info;
}


public String fallBack () {
	return "fall back ";
}
}
