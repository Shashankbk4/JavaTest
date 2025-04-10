package com.example.demo2.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdService implements GenericService {
	 @Value("${my.profile.code}")
	private String code;

	public ProdService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProdService(String code) {
		super();
		code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		code = code;
	}

	@Override
	public String toString() {
		return "ProdService [Code=" + code + "]";
	}


	public void executeTask() {
		System.out.println("prod service running");
		System.out.println("prod service code is -> " +code);
		
	}
	
}
