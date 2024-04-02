package com.datastructures_pack;

public class StkMain {

	public static void main(String[] args) {
			Stack stk = new Stack(5);
			
			stk.push(10);
			stk.push(20);
			stk.push(30);
			stk.push(40);
			stk.push(50);
			
			System.out.println("Stack Size : " + stk.Size());
			
			System.out.println("Present values of Stack : ");
			stk.ShowValues();
			System.out.println("\nRemoval Process");
			stk.pop();
			stk.ShowValues();
			stk.pop();
			stk.ShowValues();
			stk.pop();
			stk.ShowValues();
			stk.pop();
			stk.ShowValues();
			stk.pop();
			stk.ShowValues();
			stk.pop();
			stk.ShowValues();
	}
}
