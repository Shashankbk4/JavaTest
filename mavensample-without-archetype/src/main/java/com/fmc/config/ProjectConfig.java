package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fmc.Vehicle;

@Configuration
public class ProjectConfig {

	@Bean
	public Vehicle vehicle1() {
		Vehicle veh=new Vehicle();
		veh.setName("Honda");
		return  veh; 
	}
	@Bean(name="audivehicle")
	public Vehicle vehicle12() {
		Vehicle veh=new Vehicle();
		veh.setName("AUDI");
		return veh; 
	}
	@Bean
	@Primary
	public Vehicle vehicle3() {
		Vehicle veh=new Vehicle();
		veh.setName("FERRARI");
		return veh; 
	}
	
	@Bean
	String hello() {
		return "hello world";
	}
	@Bean
	Integer number() {
		return 15;
	}
}
