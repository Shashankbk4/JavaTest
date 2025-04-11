package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
     
	  public void playMusic() {
	        System.out.println("Music is playing...");
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Music stopped");
	    }
}
