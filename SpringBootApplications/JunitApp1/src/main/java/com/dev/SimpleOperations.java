package com.dev;

public class SimpleOperations {

	public int Addition(int x, int y)
	{
		return x+y;
	}
	
	public int SmallValFromArray(int x[])
	{
		int sm = x[0];
		for(int i=0;i<x.length;i++)
		{
			if(sm>x[i])
				sm = x[i];
		}
		return sm;
	}
}
