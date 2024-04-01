package com.lambdaexpression_pack;
import java.util.*;
public class LambdaEx4 {

	public static void main(String[] args) {

		List<String> lstStr = new ArrayList<String>();
		lstStr.add("Pavan");
		lstStr.add("Karan");
		lstStr.add("Lavan");
		lstStr.add("Bhavan");
		lstStr.add("Mavan");
		
		// for loop
		for(String s : lstStr)
			System.out.println(s);
		
		// lambda expression
		lstStr.forEach((st)->System.out.println(st));
		
	}
}
