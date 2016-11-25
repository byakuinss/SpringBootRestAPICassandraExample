package com.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Main application to run boot application.
 * 
 * @author Grace Yu
 * @version 1.0
 */

@Configuration
@SpringBootApplication
@ComponentScan(basePackages="com.test")
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
	
	//build code
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(applicationClass);
	}
	
	private static Class<Application> applicationClass = Application.class;
	
}
