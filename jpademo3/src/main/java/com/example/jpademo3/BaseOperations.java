package com.example.jpademo3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpademo3.pojo.Players;
import com.example.jpademo3.pojo.Teams;
import com.example.jpademo3.repo.Franchice;
import com.example.jpademo3.repo.National;

@Component
public class BaseOperations implements CommandLineRunner {
	@Autowired
	private Franchice frepo;

	@Autowired
	private National nrepo;

	@Autowired
	private DataFetch data;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("command line runner ===========");
		
		 /* Teams t1 = new Teams(); t1.setTeamName("INDIA");
		  
		  Teams t2 = new Teams(); t2.setTeamName("RCB");
		  
		  Teams t3 = new Teams(); t3.setTeamName("DC");
		  
		  Teams t4 = new Teams(); t4.setTeamName("MI");
		  
		 
		  Players p1 = new Players(); p1.setName("SACHIN");
		  
		  Players p2 = new Players(); p2.setName("VIRAT");
		  
		  Players p3 = new Players(); p3.setName("RAHUL");
		  
		  Players p4 = new Players(); p4.setName("BUMRAH");
		  
		  p1.setTeams(Arrays.asList(t1, t4)); p2.setTeams(Arrays.asList(t1, t2));
		  p3.setTeams(Arrays.asList(t1, t3)); p4.setTeams(Arrays.asList(t1, t4));
		  
		  t1.setPlayers(Arrays.asList(p1, p2, p3, p4));
		  t2.setPlayers(Arrays.asList(p2)); t3.setPlayers(Arrays.asList(p3));
		  t4.setPlayers(Arrays.asList(p4));
		  
		  nrepo.saveAll(Arrays.asList(t1, t2, t3, t4)); frepo.saveAll(Arrays.asList(p1,
		  p2, p3, p4)); */
		 
		

		
		
		  List<Teams> teams=nrepo.findAll();
		  teams.forEach(team ->
		  System.out.println(team.getId()+"------>"+team.getTeamName()));
		  System.out.println("===================");
		  data.fetch();
	
         List<Players> players=frepo.findAll();
 
         players.forEach(player -> System.out.println(player.getId() +"------>"+player.getName()));
		 
         System.out.println("=====================");
         for(Players player:players) {
        List<Teams> teams1=player.getTeams();
        teams1.forEach(team -> System.out.println("players team name   ---> "+ team.getTeamName()));
         }
		  
        /*Optional<Players> opt= frepo.findById(4);
        
         if (opt.isPresent()) {
        	     Players player=opt.get();
        	     player.getTeams().clear();
             frepo.delete(player);
             System.out.println("Franchice with ID 4 deleted.");
         } else {
             System.out.println("Franchice with ID 4 not found.");
         }*/
          
         //frepo.deleteAll();

		frepo.deleteAllInBatch();
		 

	}
}
