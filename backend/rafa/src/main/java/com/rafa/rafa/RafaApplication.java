package com.rafa.rafa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rafa.rafa.Repository")
@EntityScan(basePackages = "com.rafa.rafa.models")
@ComponentScan("com.rafa.rafa")
public class RafaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RafaApplication.class, args);
	}

}
