package com.example.demo1.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Employee implements CommandLineRunner{
     @Value("${my.info.emp.id}")
	 private int id;
     @Value("${my.info.emp.name}")
	 private String name;
     @Value("${my.info.emp.salary}")
	 private double salary;
   
     
 	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary) { // it is not required but if we
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		//System.out.println(this.toString());//
		System.out.println("Last =============== run method is running");
		System.out.println(this);
		
	}
	 
}
