package com.polymarphisum;

class TestA
{
	public void GetVal(int n)
	{
		System.out.println(n + " Square Value is " + (n*n));
	}
}

class TestB extends TestA
{
	public void GetVal(int n)
	{
		System.out.println(n + " Cube Value is " + (n*n*n));
	}	
}

public class OverRideMain {

	public static void main(String[] args) {
		TestA ta = null;
		
		ta = new TestA();
		ta.GetVal(10);
		
		ta = new TestB();  // overriding
		ta.GetVal(10);
	}
}
