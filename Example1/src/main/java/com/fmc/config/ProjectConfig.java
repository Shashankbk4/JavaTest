package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fmc.BaseSpeaker;
import com.fmc.BridgeStoneTyres;
import com.fmc.MichelinTyres;
import com.fmc.Person;
import com.fmc.SonySpeaker;
import com.fmc.Vehicle;

@Configuration
@ComponentScan("com.fmc")
public class ProjectConfig {

	@Bean
	@Primary
	public Person person1() {
		Person p1=new Person();
		p1.setName("Rahul");
		return p1;
	}
	@Bean
	public Person person2() {
		Person p2=new Person();
		p2.setName("Virat");
		return p2;
	}
	
	@Bean
	@Primary
	public Vehicle vehicle1() {
		Vehicle veh1=new Vehicle();
		veh1.setvName("audi");
		return veh1;
	}
	@Bean
	public Vehicle vehicle2() {
		Vehicle veh2=new Vehicle();
		veh2.setvName("honda");
		return veh2;
	}
	@Bean
	public BridgeStoneTyres tyre1() {
		BridgeStoneTyres bridge1=new BridgeStoneTyres();
		return bridge1;
	}
	@Bean
	public MichelinTyres tyre2() {
		 MichelinTyres mich1=new MichelinTyres();
	     return mich1;
	}
	@Bean
	public SonySpeaker speaker1() {
		SonySpeaker sony1=new SonySpeaker();
		return sony1;
	}
	@Bean
	public BaseSpeaker speaker2() {
		BaseSpeaker base1=new BaseSpeaker();
		return base1;
	}
}
