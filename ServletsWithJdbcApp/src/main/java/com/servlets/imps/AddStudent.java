package com.servlets.imps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.dbcon.DbConnection;

import java.sql.*;
/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rno = request.getParameter("txtRno");
		String sname = request.getParameter("txtStdName");
		String course = request.getParameter("ddlCourse");
		String fees = request.getParameter("txtFees");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		//System.out.println(rno + " " + sname + " " + course + " " + fees);
		
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement  psObj = con.prepareStatement("INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(?,?,?,?)");
			psObj.setInt(1, Integer.parseInt(rno));
			psObj.setString(2, sname);
			psObj.setString(3, course);
			psObj.setFloat(4, Float.parseFloat(fees));
			
			int res = psObj.executeUpdate();
			if(res>=1)
			{
				//response.sendRedirect("AddStd.html");
				response.sendRedirect("ViewStudents");
				//out.print("<h1>Student is Added Successfully...");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
