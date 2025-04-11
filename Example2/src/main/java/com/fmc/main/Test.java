package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Car;
import com.fmc.config.ProjectConfig;

public class Test {
 public static void main(String[] args) {
	 ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
	 Car car=context.getBean(Car.class);
	    boolean isStarted=true;
	   car.start(isStarted);
	   
	   
}
}
