package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rno = sc.nextInt();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisdb4","root", "root");
			PreparedStatement psObj = conObj.prepareStatement("select * from Student where rollno=?");
			psObj.setInt(1, rno);
			ResultSet rsObj = psObj.executeQuery();
			if(rsObj.next())
			{
				System.out.println("Roll Number : " + rsObj.getInt("rollno"));
				System.out.println("Student Name : " + rsObj.getString("stdname"));
				System.out.println("Course Name: " + rsObj.getString("course"));
				System.out.println("Course Fees  : " + rsObj.getFloat("fees"));
			}
			else
				System.out.println("No Student Found....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
