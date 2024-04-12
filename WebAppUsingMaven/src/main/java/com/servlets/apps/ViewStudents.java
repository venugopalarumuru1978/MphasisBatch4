package com.servlets.apps;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.servlets.entities.Student;
import com.servlets.opers.StdOperations;

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
		
		StdOperations  stdoper = new StdOperations();
		List<Student>  stdinfo = stdoper.ViewAll(); 
		
		out.print("<p style='text-align: center;'>");
		out.print("<a href='AddStd.html'>New Student</a>");
		out.print("&nbsp;&nbsp;&nbsp;");
		out.print("<a href='ViewStudents'>View All Students</a>");
		out.print("&nbsp;&nbsp;&nbsp;");
		out.print("<a href='SearchStudent.html'>Search Student</a></p>");
		try {
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>Roll Number</th><th>Student Name</th><th>Course</th><th>Fees</th><th>Operations</th></tr>");
			
			for(Student std : stdinfo)
			{
				out.print("<tr>");
				out.print("<td>" + std.getRollno() + "</td>");
				out.print("<td>" + std.getStdname() + "</td>");
				out.print("<td>" + std.getCourse() + "</td>");
				out.print("<td>" + std.getFees() + "</td>");
				out.print("<td><a href='DeleteStd?rno=" + std.getRollno() + "'>Delete</a>");
				out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
				out.print("<a href='UpdateStd?rno=" + std.getRollno() + "'>Modify</a></td>");
				out.print("</tr>");
			}			
			out.print("</table>");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
