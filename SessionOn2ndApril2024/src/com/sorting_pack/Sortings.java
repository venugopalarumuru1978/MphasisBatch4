package com.sorting_pack;

public class Sortings {

	public static int[] BubbleSortAsendingOrder(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		return x;
	}
	
	public static int[] BubbleSortDesendingOrder(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		return x;
	}
}
