package com.fmc.jpademo2.pojo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	
	private String name;
	
	@OneToMany(mappedBy = "department",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Employee> emeployees;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmeployees() {
		return emeployees;
	}
	public void setEmeployees(List<Employee> emeployees) {
		this.emeployees = emeployees;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", emeployees=" + emeployees + "]";
	}
	
	
	
}
