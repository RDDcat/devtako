package com.tako.devtako;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class DevtakoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevtakoApplication.class, args);
	}

}