package com.example.gMake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.example.gMake", "controller"})
@EnableMongoRepositories("Repository")
@SpringBootApplication
public class BackendGMakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendGMakeApplication.class, args);
	}
}
