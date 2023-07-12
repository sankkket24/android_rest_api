package com.android;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AndroidRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndroidRestApiApplication.class, args);
	}

}
