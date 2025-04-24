package com.example.jpademo3.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jmx.export.annotation.ManagedAttribute;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Players {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
     @ManyToMany(fetch = FetchType.EAGER,cascade =CascadeType.ALL)
	 @JoinTable(
	 name="player_team",
	 joinColumns = @JoinColumn(name="players_id"),
	 inverseJoinColumns = @JoinColumn(name="teams_id"))
     private List<Teams> teams=new ArrayList<Teams>() ;
	
     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Teams> getTeams() {
		return teams;
	}
	public void setTeams(List<Teams> teams) {
		this.teams = teams;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", teams=" + teams + "]";
	}

	
	
	
}
