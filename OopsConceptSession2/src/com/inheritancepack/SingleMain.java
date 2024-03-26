package com.inheritancepack;

class DemoParent
{
	protected int x, y;
	
	public void getdata(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class DemoChild extends DemoParent
{
	private int sum;
	
	public void putdata()
	{
		sum = x+y;
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		System.out.println("Sum val : " +sum);
	}
}

public class SingleMain {

	public static void main(String[] args) 
	{
		DemoChild dc1 = new DemoChild();
		dc1.getdata(20, 10);
		dc1.putdata();
	}
}
