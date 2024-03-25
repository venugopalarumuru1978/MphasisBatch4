package com.getters_setters_pack.assignment;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student std = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID ");
		int sid = sc.nextInt();
		System.out.println("Enter Student Name ");
		String sname = sc.next();
		
		System.out.println("Enter Student Address ");
		String adrs = sc.next();
		
		
		while(true)
		{		
			System.out.println("is Student NIT college / Not (Yes/No)");
			String ch = sc.next();
			if((ch.equals("Yes") || ch.equals("No")))
			{
				if(ch.equals("Yes"))
				{
					std = new Student(sid, sname, adrs);
				}
				
				if(ch.equals("No"))
				{
					System.out.println("Enter College Name : ");
					String clg = sc.next();	
					std = new Student(sid, sname, adrs, clg);
				}
				System.out.println("Student ID : " + std.getStudentId());
				System.out.println("Student Name : " + std.getStudentName());
				System.out.println("Student Address : " + std.getStudentAddress());
				System.out.println("Student College : " + std.getCollegeName());			

				break;
			}
			else
				System.out.println("Wrong Input");
		}
	}
}
