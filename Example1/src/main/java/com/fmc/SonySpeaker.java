package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {

	public void makeSound() {
		System.out.println("Sony Speaker is playing music");
		
	}
}
