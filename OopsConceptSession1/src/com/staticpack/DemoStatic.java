package com.staticpack;

public class DemoStatic {

	private static int x, y;

	public static void getdata(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public static void putdata()
	{
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
		int sum = x+y;
		System.out.println("Sum val : " + sum);
	}
}
