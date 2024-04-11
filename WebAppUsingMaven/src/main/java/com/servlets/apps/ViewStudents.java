package com.servlets.apps;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.dbcon.DbConnection;

/**
 * Servlet implementation class ViewStudents
 */
public class ViewStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<p style='text-align: center;'>");
		out.print("<a href='AddStd.html'>New Student</a>");
		out.print("&nbsp;&nbsp;&nbsp;");
		out.print("<a href='ViewStudents'>View All Students</a></p>");
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement psObj = con.prepareStatement("select * from student");
			ResultSet rs = psObj.executeQuery();
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>Roll Number</th><th>Student Name</th><th>Course</th><th>Fees</th></tr>");
			while(rs.next())
			{
				out.print("<tr>");
				out.print("<td>" + rs.getInt("rollno") + "</td>");
				out.print("<td>" + rs.getString("stdname") + "</td>");
				out.print("<td>" + rs.getString("course") + "</td>");
				out.print("<td>" + rs.getFloat("fees") + "</td>");
				out.print("</tr>");
			}			
			out.print("</table>");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
