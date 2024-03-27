package com.exceptionpack;

import java.io.IOException;

public class Excep3 
{
	public static void main(String[] args) throws IOException {
		System.out.println("Enter any character : ");
		int ch = System.in.read();
		
		System.out.println("Given Character is : " + (char)ch);
	}
}