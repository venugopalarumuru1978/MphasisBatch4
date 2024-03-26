package com.inheritancepack;

class DemoA
{
	public DemoA()
	{
		System.out.println("Parent Class Constructor");
	}
	
	public void testMethA()
	{
		System.out.println("Parent Class Method");
	}
}

class DemoB extends DemoA
{
	public DemoB()
	{
		System.out.println("Child Class Constructor");
	}
	
	public void testMethB()
	{
		System.out.println("Child Class Method");
	}
}

public class Test1Main 
{
	public static void main(String[] args) {
		DemoB db = new DemoB();
		db.testMethA();
		db.testMethB();
	}
}
