package com.fmc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
 
	private Tyre tyre;
	private Speakers speaker;
	
	public VehicleService(@Qualifier("tyre2") Tyre tyre,@Qualifier("speaker1") Speakers speaker) {
		super();
		this.tyre = tyre;
		this.speaker = speaker;
	}
	
	public void move() {
		tyre.rotate();
	}
	public void sound() {
		speaker.makeSound();
	}
}
