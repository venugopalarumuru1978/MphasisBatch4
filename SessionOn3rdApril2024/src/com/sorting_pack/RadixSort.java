package com.sorting_pack;

public class RadixSort {

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
	
	public void CountSort(int x[], int place, int size)
	{
		
		//  100   78   123   789   87
		
		count = new int[10];
		int output[] = new int[size+1];
		
		for(int i=0;i<size;i++)
			count[(x[i]/place)%10]++;
		
		for(int i=0;i<10;i++)
			System.out.print(count[i] + "\t");
		
		
		for(int i=1;i<10;i++)
			count[i] = count[i] + count[i-1];
	
		System.out.println();
		
		for(int i=0;i<10;i++)
			System.out.print(count[i] + "\t");
		
		for(int i=size-1;i>=0;i--)
		{
			output[count[(x[i]/place)%10]-1] = x[i];
			count[(x[i]/place)%10]--;
		}
		
		for(int i=0;i<size;i++)
			x[i] = output[i];

		System.out.println("\nValues after pass completed ");

		for(int i=0;i<size;i++)
			System.out.print(x[i] + "\t");
	}
	
	public int[] radixsort(int x[], int size)
	{
		
		int max = this.findMax(x);
		for(int place=1;max/place>0;place*=10)
		{
			System.out.println("\nPlace Value : " + place);
			CountSort(x, place, size);
		}
		// place value : 1, 10, 100
		return x;
	}
}
