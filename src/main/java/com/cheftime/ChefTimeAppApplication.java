package com.cheftime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class ChefTimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChefTimeAppApplication.class, args);
	}
}
