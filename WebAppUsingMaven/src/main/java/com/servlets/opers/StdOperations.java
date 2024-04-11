package com.servlets.opers;
import java.sql.*;

import com.servlets.dbcon.DbConnection;
import com.servlets.entities.Student;
public class StdOperations {

	Connection con = null;
	public StdOperations()
	{
		con = DbConnection.getConnection();
	}
	
	public int AddStudent(Student std)
	{
		int res = -1;
		try {
			PreparedStatement  psObj = con.prepareStatement("INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(?,?,?,?)");
			psObj.setInt(1, std.getRollno());
			psObj.setString(2, std.getStdname());
			psObj.setString(3, std.getCourse());
			psObj.setFloat(4, std.getFees());
			
			res = psObj.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return res;
	}
}
