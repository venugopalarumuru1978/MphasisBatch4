package com.innerclasses;
// static inner class Ex-2
class Outer3
{
	private static int n;
	
	public static void getVal(int x)
	{
		n = x;
	}
	
	static class Inner
	{
		private static int sqr;
		
		public static void Square()
		{
			sqr = n*n;
			System.out.println(n + " Square Value is : " + sqr);
		}
	}
}

public class InnerCls4Main {

	public static void main(String[] args) {
		Outer3.getVal(10);
		Outer3.Inner.Square();
	}
}
