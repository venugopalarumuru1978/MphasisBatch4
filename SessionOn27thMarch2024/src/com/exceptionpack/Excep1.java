package com.exceptionpack;
import java.util.*;
public class Excep1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter two values ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int div = x/y;
			
			System.out.println("Division : " + div);			
		}
		catch(Exception ex)
		{
			System.out.println("Program having invalid input/operation error");
			System.out.println(ex);
		}
		finally
		{
			System.out.println("This is Finally Block");
		}
	}
}
