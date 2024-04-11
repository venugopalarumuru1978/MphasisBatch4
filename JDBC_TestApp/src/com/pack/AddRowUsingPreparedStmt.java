package com.pack;
import java.sql.*;
import java.util.Scanner;
public class AddRowUsingPreparedStmt {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Roll Number ");
			int rno = sc.nextInt();
			System.out.println("Student Name ");
			String sname = sc.next();
			System.out.println("Course Name ");
			String course = sc.next();
			System.out.println("Course Fees ");
			float fees = sc.nextFloat();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisdb4","root", "root");
			
			PreparedStatement  psObj = conObj.prepareStatement("INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(?,?,?,?)");
			psObj.setInt(1, rno);
			psObj.setString(2, sname);
			psObj.setString(3, course);
			psObj.setFloat(4, fees);
			
			psObj.executeUpdate();
			
			System.out.println("Row is added successfully....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
//