package com.example.demo1.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.info.emp")
@Component

public class Employee2 implements CommandLineRunner {

   
	 private int id;
   
	 private String name;
    
	 private double salary;
    
	
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee2(int id, String name, double salary) { // it is not required but if we
		                                                  // define this constructor then we have to define the default constructor
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		System.out.println("getting the values based on @Configurationproperty");
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		//System.out.println(this.toString());//
		System.out.println(this);
		
	}
}
