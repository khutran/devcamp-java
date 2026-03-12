package com.devcamp.hellodevcampworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloDevcampWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloDevcampWorldApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloDevcampWorldApplication.class, args);
	}

}
