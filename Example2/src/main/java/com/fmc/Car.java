package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Tyre tyre;
	private MusicPlayer musicPlayer;
	
    @Autowired
	public void setTyre(Tyre tyre) {
	        this.tyre = tyre;
	 }
	  @Autowired
	 public void setMusicPlayer(MusicPlayer musicPlayer) {
	        this.musicPlayer = musicPlayer;
	   }
	 
	public static void stop() {
		 System.out.println("car stopped");
	 }
	
	 
	  public void start(boolean isStarted) {
	               if (isStarted) {
	                tyre.rotate();
	                System.out.println("Car is moving...");
	                musicPlayer.playMusic();
	                Car.stop();
	                
	            } else {
	                System.out.println("car is not started");
	            }
	 }
}
