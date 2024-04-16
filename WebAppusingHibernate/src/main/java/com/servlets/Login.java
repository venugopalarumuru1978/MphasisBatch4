package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entities.Employee;
import com.operations.EmpOperations;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("txtUser");
		String pwd = request.getParameter("txtPwd");
		
		if(uname.equals("Admin") && pwd.equals("admin@123"))
		{
			response.sendRedirect("ViewAllEmps.jsp");
		}
		else
		{
			EmpOperations  emp_oper = new EmpOperations();
			Employee userinfo = emp_oper.UserCheck(uname, pwd);
			if(userinfo!=null)
			{
				HttpSession session = request.getSession();
				session.setAttribute("eno", userinfo.getEmpno());
				session.setAttribute("ename", userinfo.getEname());
				response.sendRedirect("EmpWelcome.jsp");
			}
			else
				response.sendRedirect("Error.jsp");
		}
	}
}
