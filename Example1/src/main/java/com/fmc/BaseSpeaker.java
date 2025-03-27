package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class BaseSpeaker implements Speakers {

	public void makeSound() {
		System.out.println("Base Speaker is playing music");
		
	}
}
