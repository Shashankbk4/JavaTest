package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class BridgestoneTyre implements Tyre {

	public void rotate() {
		 System.out.println("Bridgestone tyre");
		
	}

}
