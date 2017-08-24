package com.tournament;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;

@SpringBootApplication(scanBasePackages="com.tournament.*")
@EnableAutoConfiguration(exclude={MultipartAutoConfiguration.class})
public class ApplicationBoot {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBoot.class, args);
	}
}
