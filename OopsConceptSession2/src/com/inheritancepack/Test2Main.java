package com.inheritancepack;

class TestA
{
	protected int x;
	
	public TestA(int x)
	{
		System.out.println("Parent Class Cons");
		this.x = x;
	}
}

class TestB extends TestA
{
	private float y;
	
	public TestB(int a, float y)
	{
		super(a);
		System.out.println("Child Class Cons");
		this.y = y;
	}
	
	public void printVal()
	{
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
	}
}

public class Test2Main 
{
	public static void main(String[] args) {
		TestB tb = new TestB(100,12.45f);
		tb.printVal();
	}

}
