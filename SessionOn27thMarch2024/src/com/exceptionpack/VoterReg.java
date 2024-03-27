package com.exceptionpack;
import java.util.*;

public class VoterReg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter age of the person");
			int age = sc.nextInt();
			if(age>=18)
				System.out.println("Voter Registration is Done");
			else
				throw new InvalidAgeException("Person age must be 18 or above 18 years");
		} 
		catch(InvalidAgeException ag)
		{
			System.err.println(ag.getMessage());
		}
		catch (Exception e) {
			System.err.println("Invalid Input / Operation Error");
		}
	}
}
