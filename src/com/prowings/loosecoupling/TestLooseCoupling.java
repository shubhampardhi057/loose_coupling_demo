package com.prowings.loosecoupling;


public class TestLooseCoupling {
	
	public static void main(String[] args) {
		
		Traveller t = new Traveller();
	
		t.setVehicle(new Car());
		
		t.startJourney();
		
	}

}
