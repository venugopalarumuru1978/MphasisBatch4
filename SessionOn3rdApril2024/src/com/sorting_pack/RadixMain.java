package com.sorting_pack;

public class RadixMain {

	public static void main(String[] args) {
		//int x[] = {432, 8, 530, 90, 88, 231, 11, 45, 677, 199};
		int x[] = {100,78,123,789,87};
		RadixSort rs = new RadixSort();
		
		for(int n : x)
			System.out.print(n + "  ");

		System.out.println();
		
		x = rs.radixsort(x, x.length);
		System.out.println("\nSorted Values ");
		for(int n : x)
			System.out.print(n + "  ");		
	}

}
