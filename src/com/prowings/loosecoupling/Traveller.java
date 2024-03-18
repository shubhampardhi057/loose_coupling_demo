package com.prowings.loosecoupling;

public class Traveller {
	
	Vehicle vehicle;

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void startJourney() {
		
		System.out.println("starting journey !!");
		
		vehicle.move();
		
		
	}

}
