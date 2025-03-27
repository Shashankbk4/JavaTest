package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyre {
	
	public void rotate() {
		System.out.println("BridgeStone Tyres are rotating");
		
	}
}
