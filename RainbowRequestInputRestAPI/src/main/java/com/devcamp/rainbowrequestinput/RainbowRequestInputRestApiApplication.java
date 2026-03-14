package com.devcamp.rainbowrequestinput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RainbowRequestInputRestApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RainbowRequestInputRestApiApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RainbowRequestInputRestApiApplication.class, args);
	}

}
