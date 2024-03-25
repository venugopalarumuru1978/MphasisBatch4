package com.construtorPack;

public class DemoCons {

	private int x, y;
	
	public DemoCons()
	{
		System.out.println("It is a constructor");
		x = 100;
		y = 200;
	}
	
	public void PrintData()
	{
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
	}
}

