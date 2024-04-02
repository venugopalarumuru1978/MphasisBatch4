package com.ds.predefined;

import java.util.Stack;

public class StkExMain {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		stk.push("Pavan");
		stk.push("Kiran");
		stk.push("Komali");
		stk.push("Lava Kumar");
		stk.push("Praveen");
		
		System.out.println(stk);
		
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
	}

}
