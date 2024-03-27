package com.innerclasses;
// member inner class
class Outer
{
	private int n;
	
	public void getdata(int n)
	{
		this.n = n;
	}
	
	class Inner
	{
		private int sqr;
		
		public void Square()
		{
			sqr = n*n;
			System.out.println(n + " Square Value is " + sqr);
		}
	}
	
}



public class InnerCls1Main {

	public static void main(String[] args) {
		Outer o1 = new Outer();
		o1.getdata(10);
		Outer.Inner i1 = o1. new Inner();
		i1.Square();
	}

}
