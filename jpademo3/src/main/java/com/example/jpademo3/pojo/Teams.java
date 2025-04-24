package com.example.jpademo3.pojo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.transaction.Transactional;
@Entity
public class Teams {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String teamName;
	
	@ManyToMany(mappedBy = "teams",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Players> players=new ArrayList<Players>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
	public List<Players> getPlayers() {
		return players;
	}

	public void setPlayers(List<Players> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Teams [id=" + id + ", teamName=" + teamName + ", players=" + players + "]";
	}
	
	
	
}
