package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Employee;
import com.operations.EmpOperations;

/**
 * Servlet implementation class AddEmp
 */
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ename = request.getParameter("txtEname");
		String job = request.getParameter("ddlJob");
		String sal = request.getParameter("txtSal");
		String email = request.getParameter("txtEmail");
		String pswd = request.getParameter("txtPwd");
		
		Employee emp = new Employee();
		emp.setEmail(email);
		emp.setEname(ename);
		emp.setSalary(Float.parseFloat(sal));
		emp.setPswd(pswd);
		emp.setJob(job);
		
		EmpOperations e_oper = new EmpOperations();
		e_oper.AddEmployee(emp);
		response.sendRedirect("AddEmployee.html");
	}

}
