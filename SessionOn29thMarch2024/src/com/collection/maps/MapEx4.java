package com.collection.maps;
import java.util.*;

// Adding key-value pairs dynamically

public class MapEx4 {

	public static void main(String[] args) {

		Map<Integer, String>  stdMap = new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		String ch = null;
		do
		{
			System.out.println("Roll Number : ");
			int rno = sc.nextInt();
			System.out.println("Student Name : ");
			String sname = sc.next();
			stdMap.put(rno, sname);
			
			System.out.println("1 More Student(y/n) : ");
			ch = sc.next();
		}
		while(ch.equalsIgnoreCase("Y"));
		
		System.out.println("------------");
		System.out.println(stdMap);
	}
}
