package com.devcamp.pizza365;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Pizza365CampaignApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Pizza365CampaignApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Pizza365CampaignApplication.class, args);
	}

}
