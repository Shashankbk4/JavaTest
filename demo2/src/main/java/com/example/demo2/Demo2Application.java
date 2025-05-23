package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo2.runner.GenericService;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {
     
	@Autowired
     GenericService genericService;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	 genericService.executeTask();
	}

}
