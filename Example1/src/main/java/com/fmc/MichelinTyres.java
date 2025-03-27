package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyre {
 
public void rotate() {
		
		System.out.println("Michelin Tyres are rotating");
	}
}
