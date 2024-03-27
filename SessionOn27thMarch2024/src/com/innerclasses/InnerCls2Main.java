package com.innerclasses;
// local inner class
class Outer1
{
	private int n;
	
	public void getVal(int n)
	{
		this.n = n;
	}
	
	public void putVal()
	{
		class Inner
		{
			private int sq;
			public void Square()
			{
				sq = n*n;
				System.out.println(n + " Square  Value is " + sq);
			}
		}
		
		Inner i1 = new Inner();
		i1.Square();
	}
}

public class InnerCls2Main {

	public static void main(String[] args) {
		Outer1 ot1 = new Outer1();
		ot1.getVal(10);
		ot1.putVal();
	}
}
