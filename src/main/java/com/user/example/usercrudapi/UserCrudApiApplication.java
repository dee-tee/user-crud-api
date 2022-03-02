package com.user.example.usercrudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class UserCrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCrudApiApplication.class, args);
	}

}
