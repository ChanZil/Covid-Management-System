package com.CovidManagementSystem.CovidManagementSystem;

import com.CovidManagementSystem.CovidManagementSystem.model.Member;
import com.CovidManagementSystem.CovidManagementSystem.service.MemberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories("com.CovidManagementSystem.CovidManagementSystem.repository")
@ComponentScan("com.CovidManagementSystem.*")
public class CovidManagementSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(CovidManagementSystemApplication.class, args);
	}
}
