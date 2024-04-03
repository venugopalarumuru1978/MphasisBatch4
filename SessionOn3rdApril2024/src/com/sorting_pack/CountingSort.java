package com.sorting_pack;

public class CountingSort {

	private int max;
	private int count[];
	
	public int findMax(int x[])
	{
		max = x[0];
		for(int i=0;i<x.length;i++)
		{
			if(max<x[i])
				max = x[i];
		}
		return max;
	}
	
	public void CountElements(int x[])
	{
		//2, 1, 1, 0, 2, 5, 4, 0 , 2, 1, 7, 9, 7, 9, 8
		int m = this.findMax(x);
		count = new int[m+1];
		
		for(int i=0;i<m+1;i++)
			System.out.print(count[i] + "  ");
		
		for(int i=0;i<x.length;i++)
		{
			++count[x[i]];
		}
		
		System.out.println();
		
		for(int i=0;i<m+1;i++)
			System.out.print(count[i] + "  ");
		
		for(int i=1;i<m+1;i++)
		{
			count[i] = count[i]+count[i-1];
		}
		
		System.out.println();
		
		for(int i=0;i<m+1;i++)
			System.out.print(count[i] + "  ");
	}
	
	public int[] Sorting(int x[])
	{
		int temp[] = new int[x.length];
		//2, 1, 1, 0, 2, 5, 4, 0 , 2, 1, 7, 9, 7, 9, 8
		for(int i=x.length-1;i>=0;i--) // 14, 13, 12, 11
		{
			temp[--count[x[i]]] = x[i];
		}
		
		x = temp;
		
		return x;
	}
}
