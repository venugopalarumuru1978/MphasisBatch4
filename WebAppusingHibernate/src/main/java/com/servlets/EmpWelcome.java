package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entities.*;
import com.operations.EmpOperations;

/**
 * Servlet implementation class EmpWelcome
 */
@WebServlet("/EmpWelcome")
public class EmpWelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpWelcome() {
        super();
        // TODO Auto-generated constructor stub
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

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); 
		if(session.getAttribute("empname")!=null)
		{
			
			out.print("<p style='text-align: center;'>");
			out.print("<a href='EmpWelcome'>Home</a>");
			out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
			out.print("<a href='ChangePassword.html'>Change Password</a>");
			out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
			out.print("<a href='Logout'>Logout</a></p><br /><hr />");
			
			String ename = (String)session.getAttribute("empname");
			
			out.print("<h1>Welcome to : " + ename + "</h1>");
			
			Integer eno = (Integer)session.getAttribute("eno");
			EmpOperations empOper = new EmpOperations();
			
			Employee emp =  empOper.SearchEmp(eno);
			
			out.print("<table border='1' width='100%'>");
			out.print("<tr><th>Emp No</th><th>Emp Name</th><th>Job</th><th>Salary</th><th>Email</th><th>Password</th></tr>");
			out.print("<tr>");
			out.print("<td>" + emp.getEmpno() + "</td>");
			out.print("<td>" + emp.getEname() + "</td>");
			out.print("<td>" + emp.getJob() + "</td>");
			out.print("<td>" + emp.getSalary() + "</td>");
			out.print("<td>" + emp.getEmail() + "</td>");
			out.print("<td>" + emp.getPswd() + "</td>");
			out.print("</tr>");
			out.print("</table>");
		}
		else
			response.sendRedirect("Login.html");
	}
}
