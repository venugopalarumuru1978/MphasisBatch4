package com.sorting_pack;

public class CountSortMain {

	public static void main(String[] args) {
		CountingSort cs = new CountingSort();
		int x[] = {2, 1, 1, 0, 2, 5, 4, 0 , 2, 1, 7, 9, 7, 9, 8};
		//int x[] = {10, 45, 89, 999, 23, 9};
		System.out.println("Max Value : " + cs.findMax(x));
		cs.CountElements(x);
		System.out.println("\n-----------");
		System.out.println("Actual Values in Array : ");
		for(int n : x)
			System.out.print(n + "  ");
		x = cs.Sorting(x);
		System.out.println("\nSorted Values in  Array : ");
		for(int n : x)
			System.out.print(n + "  ");
	}
}
