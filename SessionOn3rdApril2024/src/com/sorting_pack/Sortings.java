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
	
	public static int[] InsertionSortAlg(int x[])
	{
		for(int i=1;i<x.length;i++)
		{
			int temp = x[i];
			int j = i-1;
			
			while(j>=0 && temp<=x[j])
			{
				x[j+1] = x[j];
				j--;
			}
			x[j+1] = temp;
		}
		return x;
	}
	
	public static int[] SelectionSortAlg(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			int s_index = i;
			
			for(int j=i+1;j<x.length;j++)
			{
				if(x[j]<x[s_index])
					s_index = j;
			}
			
			int temp = x[s_index];
			x[s_index] = x[i];
			x[i] = temp;
		}
		
		return x;
	}
}
