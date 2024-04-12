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
 * Servlet implementation class UpdateStd
 */
public class UpdateStd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rno = request.getParameter("rno");
		StdOperations  stdOper = new StdOperations();
		Student std = stdOper.SearchStd(Integer.parseInt(rno));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<form method='post' action='ModifyStd'>");
		out.print("<input type='hidden' name='txtRno' value='" + std.getRollno() + "'>");
		out.print("<p style='text-align: center;'>");
		out.print("<input type='text' name='txtRnos' value='" + std.getRollno() + "' disabled>");
		out.print("<br /><br />");
		out.print("<input type='text' name='txtStdName' value='" + std.getStdname() + "'>");
		out.print("<br /><br /><label>Course : </label><br />");
		out.print("<select name='ddlCourse'>");
		if(std.getCourse().equalsIgnoreCase("Java"))
		{
			out.print("<option value='Java' selected>Java</option>");
			out.print("<option value='Python'>Python</option>");
			out.print("<option value='Dotnet'>Dotnet</option>");
			out.print("<option value='MySQL'>MySQL</option>");
		}
		if(std.getCourse().equalsIgnoreCase("Python"))
		{
			out.print("<option value='Java'>Java</option>");
			out.print("<option value='Python' selected>Python</option>");
			out.print("<option value='Dotnet'>Dotnet</option>");
			out.print("<option value='MySQL'>MySQL</option>");
		}
		if(std.getCourse().equalsIgnoreCase("Dotnet"))
		{
			out.print("<option value='Java'>Java</option>");
			out.print("<option value='Python'>Python</option>");
			out.print("<option value='Dotnet'  selected>Dotnet</option>");
			out.print("<option value='MySQL'>MySQL</option>");
		}
		if(std.getCourse().equalsIgnoreCase("MySQL"))
		{
			out.print("<option value='Java'>Java</option>");
			out.print("<option value='Python'>Python</option>");
			out.print("<option value='Dotnet'>Dotnet</option>");
			out.print("<option value='MySQL' selected>MySQL</option>");
		}
		out.print("</select>");
		out.print("<br /><br />");
		out.print("<input type='text' name='txtFees' value='" + std.getFees() + "'>");
		out.print("<br /><br />");
		out.print("<input type='submit'  value='Update Student' />");
		out.print("</p>");
		out.print("</form>");
		out.print("<br /><h2 style='text-align:center'><a href='ViewStudents'>Back</a></h2>");
	}
}
