package com.taskauth.TaskAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:env.properties")

public class TaskAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskAuthApplication.class, args);
	}

}
