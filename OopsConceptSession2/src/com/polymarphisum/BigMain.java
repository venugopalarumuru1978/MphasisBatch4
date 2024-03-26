package com.polymarphisum;

class BigNumber 
{
	public void Big(int x, int y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big No " + x);
		else
			System.out.println(x + " and " + y + " Big No " + y);
	}
	
	public void Big(float x, float y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big No " + x);
		else
			System.out.println(x + " and " + y + " Big No " + y);
	}

	public void Big(int x, float y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big No " + x);
		else
			System.out.println(x + " and " + y + " Big No " + y);
	}
	
}

public class BigMain {

	public static void main(String[] args) {
		BigNumber  bn = new BigNumber();
		bn.Big(10, 5);
		bn.Big(1.5f, 2.0f);
		bn.Big(12, 4.0f);
	}
}
