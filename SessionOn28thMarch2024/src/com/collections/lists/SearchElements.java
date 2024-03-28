package com.collections.lists;
import java.util.*;
public class SearchElements {
// Search  values/elements
	public static void main(String[] args) {
		
		List<String>  lstStr = new ArrayList<String>();
		
		lstStr.add("SimpliLearn");
		lstStr.add("Mphasis");
		lstStr.add("Wipro");
		lstStr.add("Cognizent");
		lstStr.add("TCS");
		lstStr.add("Mphasis");

		System.out.println("List Values : " + lstStr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Value to Search");
		String s_val = sc.next();
		
		if(lstStr.contains(s_val))
			System.out.println(s_val + " is Existed");
		else
			System.out.println(s_val + " is not Existed");
		
	}
}
