package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Person;
import com.fmc.config.ProjectConfig;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
Person person=context.getBean(Person.class);
     person.start();
 
}
}
