package com.sorting_pack;

public class SelectionSortMain {

	public static void main(String[] args) {

		int x[] = {10, -9, 3, 1, 6};
		
		System.out.println("Actual Values : ");
		for(int n : x)
			System.out.print(n + "\t");
		
		int res[] = Sortings.SelectionSortAlg(x);
		
		System.out.println("\nSorted Values using Selection Sort: ");
		for(int n : res)
			System.out.print(n + "\t");
	}
}
