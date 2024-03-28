package com.collections.sets;
import java.util.*;
public class SetEx1 {
// HashSet Example
	public static void main(String[] args) {
		Set<String>  setStr = new HashSet<String>();
		setStr.add("Hyderabad");
		setStr.add("Bangalore");
		setStr.add("Amaravathi");
		setStr.add("Kolkatta");
		setStr.add("Hyderabad");
		setStr.add("Pune");
		
		System.out.println(setStr);
		
		System.out.println("--------------");
		
		for(String str : setStr)
		{
			System.out.println(str);
		}
		
		
		
	}

}
