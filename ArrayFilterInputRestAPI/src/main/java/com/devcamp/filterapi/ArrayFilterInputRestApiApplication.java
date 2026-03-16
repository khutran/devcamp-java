package com.devcamp.filterapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ArrayFilterInputRestApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ArrayFilterInputRestApiApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ArrayFilterInputRestApiApplication.class, args);
	}

}
