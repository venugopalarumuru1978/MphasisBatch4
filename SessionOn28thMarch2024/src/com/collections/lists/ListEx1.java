package com.collections.lists;
import java.util.*;
public class ListEx1 {
// creating a list and traversing values/elements
	public static void main(String[] args) {
		
		List<String>  lstStr = new ArrayList<String>();
		
		lstStr.add("SimpliLearn");
		lstStr.add("Mphasis");
		lstStr.add("Wipro");
		lstStr.add("Cognizent");
		lstStr.add("TCS");
		lstStr.add("Mphasis");

		System.out.println(lstStr);
		System.out.println("No of Values : " + lstStr.size());
		List<Integer>  lstInt = new ArrayList<Integer>();
		lstInt.add(100);
		lstInt.add(101);
		lstInt.add(102);
		lstInt.add(103);
		lstInt.add(104);
		lstInt.add(102);
		
		System.out.println(lstInt);
		
		// Traversal of List Elements
		
		for(String str : lstStr) // for each loop
		{
			System.out.println(str);
		}
		
		System.out.println("------------");
		//Iterator interface
		Iterator itr = lstStr.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("----------");
		
		Iterator itr1 = lstInt.iterator();
		
		while(itr1.hasNext())
			System.out.println(itr1.next());
	}

}
