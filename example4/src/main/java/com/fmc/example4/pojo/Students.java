package com.fmc.example4.pojo;

import java.util.ArrayList;
import java.util.List;

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
import jakarta.persistence.OneToOne;

@Entity
public class Students {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    private String name;
    
    
   @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
   @JoinColumn(name="Department_id")
    private Department departments;

   @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   @JoinTable(
   	name="Students_courses"	,
   	joinColumns = @JoinColumn(name="Course_Id"),
   	inverseJoinColumns = @JoinColumn(name="student_Id")
   		)
   
    private List<Course> courses =new ArrayList<>();
    
   @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   @JoinColumn(name="address_id")
    private Address address;

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

public Department getDepartments() {
	return departments;
}

public void setDepartments(Department departments) {
	this.departments = departments;
}

public List<Course> getCourses() {
	return courses;
}

public void setCourses(List<Course> courses) {
	this.courses = courses;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Students [id=" + id + ", name=" + name + ", departments=" + departments + ", courses=" + courses
			+ ", address=" + address + "]";
}
   
   

		   
   



	}
