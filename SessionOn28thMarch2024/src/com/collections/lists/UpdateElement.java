package com.collections.lists;
import java.util.*;
public class UpdateElement {
// update  values/elements
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
		{
			System.out.println("Enter new value : ");
			String stemp = sc.next();
			
			lstStr.remove(s_val);
			lstStr.add(stemp);
			System.out.println("After Update :\n" + lstStr);
		}
		else
			System.out.println(s_val + " is not Existed");
		
	}
}
