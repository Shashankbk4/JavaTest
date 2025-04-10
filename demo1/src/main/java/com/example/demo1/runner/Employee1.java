package com.example.demo1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component
public class Employee1 implements CommandLineRunner {
     @Autowired
	 Environment env;
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("getting the values by using Environment object");
		System.out.println("=============================================");
		System.out.println(env.getProperty("my.info.emp.id"));
		System.out.println(env.getProperty("my.info.emp.name"));
		System.out.println(env.getProperty("my.info.emp.salary"));
		System.out.println("=============================================");
	}

	
}
