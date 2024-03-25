package com.construtorPack;

public class ConsMain {

	public static void main(String[] args) {
		
		DemoCons dc1 = new DemoCons();
		dc1.PrintData();

		System.out.println("--------------------");
		
		ConsParam cp1 = new ConsParam(10, 20);
		cp1.PrintData();

		ConsParam cp2 = new ConsParam(210, 320);
		cp2.PrintData();

		System.out.println("---------------------");
		
		MultiCons  mc1 = new MultiCons();
		mc1.PrintData();
		
		MultiCons  mc2 = new MultiCons(78,90);
		mc2.PrintData();
		
	}
}
