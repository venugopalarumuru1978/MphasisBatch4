package com.sorting_pack;

public class SortMain {

	public static void main(String[] args) {

		int x[] = {10, -9, 3, 1, 6};
		
		System.out.println("Actual Values : ");
		for(int n : x)
			System.out.print(n + "\t");
		
		int res[] = Sortings.BubbleSortAsendingOrder(x);
		
		System.out.println("\nSorted Values in Asending Order using Bubble Sort: ");
		for(int n : res)
			System.out.print(n + "\t");
		
		res = Sortings.BubbleSortDesendingOrder(x);
		
		System.out.println("\nSorted Values in Desending Order using Bubble Sort: ");
		for(int n : res)
			System.out.print(n + "\t");
	}

}
