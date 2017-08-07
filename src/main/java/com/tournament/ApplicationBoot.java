package com.tournament;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.tournament.*")
public class ApplicationBoot {

	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationBoot.class, args);
	}
}
