package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class MrfTyre implements Tyre{

	public void rotate() {
		System.out.println("MRF Tyres rotating");
		
	}

}
