package com.example.develpo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.example.develpo"})
@SpringBootApplication
public class DevelpoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevelpoApplication.class, args);
	}

}
