package com.servlets.opers;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.servlets.dbcon.DbConnection;
import com.servlets.entities.Student;

/*
 * CURD Operations
 * C - Create
 * U - Update
 * R - Read
 * D - Delete
 */

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
	
	public List<Student>  ViewAll()
	{
		List<Student>  stdall = new ArrayList<Student>();
		Student std = null;
		try {
			PreparedStatement psObj = con.prepareStatement("select * from student");
			ResultSet rs = psObj.executeQuery();
			while(rs.next())
			{
				std = new Student();
				std.setRollno(rs.getInt("rollno"));
				std.setStdname(rs.getString("stdname"));
				std.setCourse(rs.getString("course"));
				std.setFees(rs.getFloat("fees"));
				stdall.add(std);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return stdall;
	}
	
	public Student SearchStd(int rno)
	{
		Student std = null;
		try {
			PreparedStatement psObj = con.prepareStatement("select * from student where rollno=?");
			psObj.setInt(1, rno);
			ResultSet rs = psObj.executeQuery();
			if(rs.next())
			{
				std = new Student();
				std.setRollno(rs.getInt("rollno"));
				std.setStdname(rs.getString("stdname"));
				std.setCourse(rs.getString("course"));
				std.setFees(rs.getFloat("fees"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return std;
	}
	
	public int DeleteStudent(int rno)
	{
		int res = -1;
		try {
			PreparedStatement psObj = con.prepareStatement("delete from student where rollno=?");
			psObj.setInt(1, rno);
			res = psObj.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return res;
	}
	
	public int UpdateStudent(Student std)
	{
		int res = -1;
		
		try {
			PreparedStatement psObj = con.prepareStatement("update student set stdname=?, course=?, fees=? where rollno=?");
			psObj.setString(1, std.getStdname());
			psObj.setString(2, std.getCourse());
			psObj.setFloat(3, std.getFees());
			psObj.setInt(4, std.getRollno());
			res = psObj.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return res;
	}
}