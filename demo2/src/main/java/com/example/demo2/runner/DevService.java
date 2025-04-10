package com.example.demo2.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component

@Profile("default") 
public class DevService implements GenericService {
	 @Value("${my.profile.code}")
	 private String code;

	public DevService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DevService(String code) {
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
		return "DevService [code=" + code + "]";
	}

	@Override
	public void executeTask() {
		System.out.println("Dev service running");
		System.out.println("dev service code is -> "+code);
		
	}
	 
}
