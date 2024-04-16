package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entities.*;
import com.operations.EmpOperations;

/**
 * Servlet implementation class ViewAllEmps
 */
@WebServlet("/ViewAllEmps")
public class ViewAllEmps extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllEmps() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		if(session.getAttribute("admin")!=null)
		{
			out.print("<p style='text-align: center;'>");
			out.print("<a href='AddEmp.html'>New Employee</a>");
			out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
			out.print("<a href='ViewAllEmps'>View All Employees</a>");
			out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
			out.print("<a href='Logout'>Logout</a></p><br /><hr />");
			out.print("<h3 style='width: 100%;text-align: center;'>All Employees Info</h3><hr />");
			EmpOperations empOper = new EmpOperations();
			List<Employee>  empAll = empOper.ShowAll();
			out.print("<table border='1' width='100%'>");
			
			out.print("<tr><th>Emp No</th><th>Emp Name</th><th>Job</th><th>Salary</th><th>Email</th><th>Password</th><th>Operations</th></tr>");
			
			for(Employee e : empAll)
			{
				out.print("<tr>");
				out.print("<td>" + e.getEmpno() + "</td>");
				out.print("<td>" + e.getEname() + "</td>");
				out.print("<td>" + e.getJob() + "</td>");
				out.print("<td>" + e.getSalary() + "</td>");
				out.print("<td>" + e.getEmail() + "</td>");
				out.print("<td>" + e.getPswd() + "</td>");
				out.print("<td><a href='DeleteEmp?eno=" + e.getEmpno() +"'>Delete</a></td>");
				out.print("</tr>");
			}
			out.print("</table>");
		}
		else
			response.sendRedirect("Login.html");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
