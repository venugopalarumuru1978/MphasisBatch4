package com.lambdaexpression_pack;
// functional interface
interface greetings 
{
	public void Wish(String pname);
}

interface Addition
{
	public int Add(int x, int y);
}

public class LambdaEx3 {

	public static void main(String[] args) {

		greetings  gr = (pname)->{
			System.out.println("Good Morning : " + pname);
		};
		
		gr.Wish("Ravi Kiran");
		
		Addition ad = (a, b)->{
			System.out.println("First Val : " + a);
			System.out.println("Second Val : " + b);
			return a+b;
		};
		
		System.out.println("Addition Value is : " + ad.Add(10, 20));
	}
}
