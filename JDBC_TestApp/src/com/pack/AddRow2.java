package com.pack;
import java.sql.*;
import java.util.Scanner;
public class AddRow2 {

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
			//INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(101, 'SAHASRA', 'JAVA', 15000.00);
			String inscmd = "INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(" + rno + ",'" + sname + "','" + course + "'," + fees + ")";
			System.out.println(inscmd);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisdb4","root", "root");
			
			Statement stmt = conObj.createStatement();
			stmt.executeUpdate(inscmd);
			System.out.println("Row is added successfully....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
//INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(101, 'SAHASRA', 'JAVA', 15000.00);