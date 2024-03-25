package com.construtorPack;

public class MultiCons {

	private int x, y;
	
	public MultiCons()
	{
		System.out.println("It is a constructor without parameters");
		x = 234;
		y = 456;
	}
	
	public MultiCons(int x, int y)
	{
		System.out.println("It is a constructor with parameters");
		this.x = x;
		this.y = y;
	}
	
	public void PrintData()
	{
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
	}
}