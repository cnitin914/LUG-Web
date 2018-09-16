package com.LUG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class LugWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LugWebApplication.class, args);
	}
}
