package com.example.demo2.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

@Profile("uat")
public class UatService implements GenericService {
   @Value("${my.profile.code}")
	private String code;

	public UatService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UatService(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "UatService [code=" + code + "]";
	}

	@Override
	public void executeTask() {
	System.out.println("uat service is running");
	System.out.println("uat service code is -> "+code);
		
	}

	
	
}
