package com.ds;

public class StkMain {

	public static void main(String[] args) {
		Stack stk = new Stack(5);
		
		stk.Push(10);
		stk.Push(20);
		stk.Push(30);
		stk.Push(40);
		stk.Push(50);
		
		System.out.println("Stack Size : " + stk.Size());
		
		System.out.println("Present values of Stack : ");
		stk.PrintValues();
		System.out.println("\nRemoval Process");
		stk.Pop();
		stk.PrintValues();
		stk.Pop();
		stk.PrintValues();
		stk.Pop();
		stk.PrintValues();
		stk.Pop();
		stk.PrintValues();
		stk.Pop();
		stk.PrintValues();
		stk.Pop();
		stk.PrintValues();
	}

}
