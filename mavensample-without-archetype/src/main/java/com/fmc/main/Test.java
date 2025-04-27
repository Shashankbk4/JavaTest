package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.Vehicle;
import com.fmc.config.ProjectConfig;

public class Test {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.setName("honda== city");
		System.out.println(v.getName());
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		//retrive the data based on method name//
		Vehicle veh=context.getBean("vehicle1",Vehicle.class);
		System.out.println("spring context===>"+veh.getName());
		
		// retrive the data based on bean name//
		Vehicle veh1=context.getBean("audivehicle",Vehicle.class);
		System.out.println("spring context===>"+veh1.getName());
		// retrive the data by using @primary annotation if we specify @primary above the method then that metod is default method of that vehicle class we can retrive withot any method name and bean name
		Vehicle veh2=context.getBean(Vehicle.class);
		System.out.println("spring context===>"+veh2.getName());
		
		String hello=context.getBean(String.class);
		System.out.println("spring context===>"+hello);
		
		Integer num=context.getBean(Integer.class);
		System.out.println("Integer context==>"+num);
	}
}
