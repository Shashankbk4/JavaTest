package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		System.out.println("main method started");
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("Spring Boot Application main method");
	}
	
	

}
