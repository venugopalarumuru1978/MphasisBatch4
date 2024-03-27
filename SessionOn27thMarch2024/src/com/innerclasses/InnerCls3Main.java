package com.innerclasses;
// static inner class Ex-1
class Outer2
{
	private static int n;
	
	public static void getVal(int x)
	{
		n = x;
	}
	
	static class Inner
	{
		private int sqr;
		
		public void Square()
		{
			sqr = n*n;
			System.out.println(n + " Square Value is : " + sqr);
		}
	}
}

public class InnerCls3Main {

	public static void main(String[] args) {
		Outer2.getVal(10);
		
		Outer2.Inner i1 = new Outer2.Inner();
		i1.Square();
	}
}
