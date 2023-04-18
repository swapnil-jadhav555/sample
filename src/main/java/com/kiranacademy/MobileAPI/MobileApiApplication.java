package com.kiranacademy.MobileAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class MobileApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileApiApplication.class, args);
	}

}
