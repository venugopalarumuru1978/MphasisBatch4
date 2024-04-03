package com.search_pack;
import java.util.*;
public class LinearSearch {

	public static String LinearSearchAlg(int x[], int data)
	{
		String str = null;
		boolean valChk = false;
		for(int n : x)
		{
			if(n==data)
			{
				str = "Value Found in an Array";
				valChk = true;
				break;
			}
		}
		
		if(valChk==false)
			str = "Value not Found....";
		
		return str;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = {10,23,45, 67,89,98};
		System.out.println("Array Values : ");
		for(int n : x)
			System.out.print(n + "\t");
		
		System.out.println("\nEnter value to search");
		int data = sc.nextInt();
		
		String res = LinearSearchAlg(x, data);
		
		System.out.println(res);
	}

}
