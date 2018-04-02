package com.example.Projekt0301;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.Projekt0301")
public class Projekt0301Application {

	public static void main(String[] args) {
		SpringApplication.run(Projekt0301Application.class, args);
	}
}
