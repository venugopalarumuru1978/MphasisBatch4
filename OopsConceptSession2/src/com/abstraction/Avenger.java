package com.abstraction;

public class Avenger implements Bike {

	@Override
	public void gearlessBike() {
		// TODO Auto-generated method stub
	System.out.println("Avenger is not a gearless bike");	
	}

	@Override
	public void gearsBike() {
		// TODO Auto-generated method stub
		System.out.println("Avenger is having 5 gears");
	}
}
