package com.prowings.tightcoupling;

public class Traveller {

//	Car c = new Car();

//	Bike b = new Bike();
	
	Bus bus = new Bus();
	
	public void startJourney() {
		
		System.out.println("starting journey !!!");
		
//		c.move();
		
//		b.move();
		
		bus.move();
		
		
	}
}
