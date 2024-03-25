package com.construtorPack;

public class ConsParam {

	private int x, y;
	
	public ConsParam(int x, int y)
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

