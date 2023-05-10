package com.CovidManagementSystem.CovidManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.CovidManagementSystem.CovidManagementSystem.repository")
public class CovidManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidManagementSystemApplication.class, args);
	}

}
