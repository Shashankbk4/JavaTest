package com.example.demo1.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("Accessing the arguments by using Application runner");
	System.out.println(args.getNonOptionArgs());
	System.out.println(args.getOptionNames());
	System.out.println(args.containsOption("key"));// checking the word key is present or not
	System.out.println(args.getOptionValues("db"));// based on the key we can access data
	System.out.println(Arrays.asList(args.getSourceArgs()));// it returns all the arguments in list format
	System.out.println(args.getOptionValues("bd"));// if there is no key in that name it returns the null
		
	}

}
