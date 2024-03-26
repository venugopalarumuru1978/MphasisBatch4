package com.abstraction;

public class Activa implements Bike {

	@Override
	public void gearlessBike() {
		System.out.println("Activa is one of the Gear less bike");
	}

	@Override
	public void gearsBike() {
		System.out.println("Activa is not a gears Bike");
	}
}
