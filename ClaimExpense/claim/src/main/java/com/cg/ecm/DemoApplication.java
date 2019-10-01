package com.cg.ecm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Main Application
 * 
 * @author Durgesh Singh
 * @author Hari Galla
 * @author Soham Kasar
 * @author Lalit Kumar
 * @author Amanjot Singh
 * @author Adarsh Gupta
 * @author Vivek Kumar
 * @author Amit Yadav
 * @version 1.0
 */
@SpringBootApplication
@EntityScan(basePackages = "com.cg.ecm")
public class DemoApplication {

	/**
	 * Main Method to run Our Spring Boot Application
	 * 
	 * @param args A String array which is used to get input from the console
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * A Bean Class to Return RestTemplate Object.
	 * 
	 * @param builder A RestTemplateBuilder object.
	 * @return A RestTemplate Object.
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
