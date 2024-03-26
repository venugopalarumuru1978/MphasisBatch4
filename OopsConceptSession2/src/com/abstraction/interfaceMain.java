package com.abstraction;

public class interfaceMain {

	public static void main(String[] args) {
		
		Bike  bike = new Activa();
		bike.gearsBike();
		bike.gearlessBike();
	
		System.out.println("-------------------");
		
		Bike bike1 = new Avenger();
		bike1.gearlessBike();
		bike1.gearsBike();

	}
}
