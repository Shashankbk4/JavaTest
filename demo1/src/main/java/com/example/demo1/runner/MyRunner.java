package com.example.demo1.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

public class MyRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("commandline runner method running");
		System.out.println("command line arguments are runninng");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		System.out.println(Arrays.asList(args));
		

		
	}

	@Override
	public int getOrder() { // based on oreder number run methods are execting
		                    // lowest order execute first highest order execute next
		// TODO Auto-generated method stub
		return 5;
	}

}
