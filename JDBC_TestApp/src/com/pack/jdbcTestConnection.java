package com.pack;
import java.sql.*;
public class jdbcTestConnection {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisdb4","root", "root");
			if(conObj!=null)
				System.out.println("Db Connected Successfully");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
