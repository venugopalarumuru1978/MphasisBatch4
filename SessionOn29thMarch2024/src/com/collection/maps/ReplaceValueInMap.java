package com.collection.maps;
import java.util.*;
import java.util.Map.Entry;
public class ReplaceValueInMap {

	public static void main(String[] args) {

		Map<Integer, String>  stdMap = new HashMap<Integer,String>();
		
		stdMap.put(1005, "Kalyan Kumar");
		stdMap.put(1001, "Sravan Kumar");
		stdMap.put(1002, "Kiran Kumar");
		stdMap.put(1004, "Varun Kumar");
		stdMap.put(1003, "Pravasthi");
		
		System.out.println(stdMap);
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rnoKey =  sc.nextInt();
		
		if(stdMap.containsKey(rnoKey))
		{
			System.out.println("Present Value is : " + stdMap.get(rnoKey));
			System.out.println("Enter New value to Modify :");
			String sname = sc.next();
			stdMap.replace(rnoKey, sname);
			System.out.println("After Modify :\n" + stdMap);
		}
		else
			System.out.println("Key is not Present in Map");
	}
}
