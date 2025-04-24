package com.example.jpademo3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.jpademo3.pojo.Players;
import com.example.jpademo3.pojo.Teams;
import com.example.jpademo3.repo.National;

import jakarta.transaction.Transactional;

@Component
public class DataFetch {

	 @Autowired
	 private National nrepo;
	
	 public void fetch() {
			List<Teams> teams=nrepo.findAll();
			  for(Teams t:teams) {
		    	   List<Players> player=t.getPlayers();
		    	   for(Players p:player) {
		    		   System.out.println("palyer name ->"+p.getName());
		    	   }
		       }
	 }
}
