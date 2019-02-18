package com.example.rest.webservices.swagger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringBootSwaggerConfig {

	 public static final Contact DEFAULT_CONTACT = new Contact("ManojKumar", "xyz@gmail.com", "http://employee.com");
	 public static final ApiInfo DEFAULT = new ApiInfo("Api Documentation - Employee ", "This will be awesome API", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	
	private static final Set<String> DEFAULT_PRODCUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("application/json","application/xml"));	
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.example.rest.webservices.controller"))
				.build().apiInfo(DEFAULT).produces(DEFAULT_PRODCUCES_AND_CONSUMES).consumes(DEFAULT_PRODCUCES_AND_CONSUMES);
				
	}
}
