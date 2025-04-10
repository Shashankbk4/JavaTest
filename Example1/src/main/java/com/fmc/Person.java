package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Person {
   private String name;
  @Autowired
   private Vehicle vehicle;
   
public Vehicle getVehicle() {
	return vehicle;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
   public void start(boolean status) {
	   System.out.println(status);
	   if(status==true) {
	   System.out.println("vehicle owner is -> "+name);
	   System.out.println("vehicle name is -> "+ vehicle.getvName());
	   System.out.println("vehicle started");
	  vehicle.getVehicleService().move();
	  vehicle.getVehicleService().sound();
	   }
	   else {
		   System.out.println("vehicle not started");
	   }
   }
}
