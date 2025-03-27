package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	 private String vName;
	 private VehicleService vehicleService;
  
	public void setvName(String vName) {
		this.vName = vName;
	}

   public String getvName() {
		return vName;
	}

public VehicleService getVehicleService() {
	return vehicleService;
}
@Autowired
public void setVehicleService(VehicleService vehicleService) {
	this.vehicleService = vehicleService;
}
    
	

	
	 
}
