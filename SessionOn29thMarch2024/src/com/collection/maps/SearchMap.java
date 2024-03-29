package com.collection.maps;
import java.util.*;
import java.util.Map.Entry;
public class SearchMap {

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
			System.out.println("Key-Value Pair Existed, It's value is : " + stdMap.get(rnoKey));
		else
			System.out.println("Key is not Present in Map");
	}
}
