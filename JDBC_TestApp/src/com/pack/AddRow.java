package com.pack;
import java.sql.*;
public class AddRow {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisdb4","root", "root");
			//INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(101, 'SAHASRA', 'JAVA', 15000.00);
			Statement stmt = conObj.createStatement();
			stmt.executeUpdate("INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(102, 'GEETHA', 'JAVA', 15000.00)");
			System.out.println("Row is added successfully....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
//INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(101, 'SAHASRA', 'JAVA', 15000.00);