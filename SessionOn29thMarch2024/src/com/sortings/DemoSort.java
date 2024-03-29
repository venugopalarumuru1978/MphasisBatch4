package com.sortings;

import java.util.Arrays;

public class DemoSort {

	public static void main(String[] args) {
		
		int x[] = {10,3,-9,5,11,7};
		
		System.out.println("Actual Array Values : ");
		for(int n : x)
			System.out.print(n + "\t");

		Arrays.sort(x);

		System.out.println("\nAfter Sorting Array Values : ");
		for(int n : x)
			System.out.print(n + "\t");

	}

}
