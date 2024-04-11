package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewStudents {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisdb4","root", "root");
			PreparedStatement psObj = conObj.prepareStatement("select * from Student");
			ResultSet rsObj = psObj.executeQuery();
			while(rsObj.next())
			{
				System.out.println("Roll Number : " + rsObj.getInt("rollno"));
				System.out.println("Student Name : " + rsObj.getString("stdname"));
				System.out.println("Course Name: " + rsObj.getString("course"));
				System.out.println("Course Fees  : " + rsObj.getFloat("fees"));
				System.out.println("-----------------");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
