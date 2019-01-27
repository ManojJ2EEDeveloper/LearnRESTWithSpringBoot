package com.example.rest.webservices.RestWebServiceBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.rest.webservices"})
public class RestWebServiceBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWebServiceBootAppApplication.class, args);
	}

}

