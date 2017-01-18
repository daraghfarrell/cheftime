package com.cheftime;

import org.springframework.boot.SpringApplication;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
=======
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
>>>>>>> initial setup, fixed gradle version issue
public class ChefTimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChefTimeAppApplication.class, args);
	}
}
