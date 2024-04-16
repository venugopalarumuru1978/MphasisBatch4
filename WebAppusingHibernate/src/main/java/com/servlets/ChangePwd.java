package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.operations.EmpOperations;

/**
 * Servlet implementation class ChangePwd
 */
@WebServlet("/ChangePwd")
public class ChangePwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String npwd = request.getParameter("txtNpwd");
		String cnpwd = request.getParameter("txtCnpwd");
		HttpSession session = request.getSession();
		Integer eno = (Integer)session.getAttribute("eno");
		
		if(npwd.equals(cnpwd))
		{
			EmpOperations empOper = new EmpOperations();
			if(empOper.ChangePassword(cnpwd, eno)==true)
				response.sendRedirect("Logout");
		}
		else
		{
			response.getWriter().print("<h2>Password and Confirm Password Must be Same</h2>");
			response.getWriter().print("<h2><a href='ChangePassword.html'>Back</a></h2>");
		}
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
