package com.servlets.apps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.entities.Student;
import com.servlets.opers.StdOperations;

/**
 * Servlet implementation class SearchStd
 */
public class SearchStd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchStd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rno = request.getParameter("txtRno");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		StdOperations  stdoper = new StdOperations();
		
		Student std = stdoper.SearchStd(Integer.parseInt(rno));
		if(std!=null)
		{
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>Roll Number</th><th>Student Name</th><th>Course</th><th>Fees</th></tr>");
			out.print("<tr>");
			out.print("<td>" + std.getRollno() + "</td>");
			out.print("<td>" + std.getStdname() + "</td>");
			out.print("<td>" + std.getCourse() + "</td>");
			out.print("<td>" + std.getFees() + "</td>");
			out.print("</tr></table>");
		}
		else
		{
			out.print("<h1 style='text-align:center'>Student Not Found</h1> ");			
		}
		
		out.print("<br /><br /><h1 style='text-align:center'><a href='SearchStudent.html'>Back</a></h1> ");
	}
}
