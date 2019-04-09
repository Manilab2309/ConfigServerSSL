package com.rcf.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ConfigApplication.class)
				.properties("spring.config.name:configserver")
				.build()
				.run(args);
	}

}
