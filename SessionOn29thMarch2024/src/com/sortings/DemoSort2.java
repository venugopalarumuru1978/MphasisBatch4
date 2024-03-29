package com.sortings;

import java.util.*;
public class DemoSort2 {

	public static void main(String[] args) {
		
		List<Integer> lstInt =  new ArrayList<Integer>();
		lstInt.add(10);
		lstInt.add(-7);
		lstInt.add(15);
		lstInt.add(7);
		lstInt.add(2);

		System.out.println("List Values : " + lstInt);
		
		Collections.sort(lstInt);
		
		System.out.println("Sorted Ordered List Values : " + lstInt);
		

	}

}
