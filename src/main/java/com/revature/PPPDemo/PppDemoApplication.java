package com.revature.PPPDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.revature") //we want to scan the com.revature package for Spring Beans
@EntityScan("com.revature.models") //we want to scan the models package for Database entities
public class PppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PppDemoApplication.class, args);
	}

}
