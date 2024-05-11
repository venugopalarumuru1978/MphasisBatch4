package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Address;
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
		String ename = request.getParameter("txtEname");
		String ads = request.getParameter("txtAdrs");
		String loc = request.getParameter("txtLoc");
		
		Address adrs = new Address();
		adrs.setHouseno(ads);
		adrs.setLocation(loc);
		
		Employee emp = new Employee();
		emp.setEname(ename);
		emp.setAdrs(adrs);
		
		EmpOperations  e_oper = new EmpOperations();
		e_oper.AddEmployee(emp);
	
		response.sendRedirect("AddEmp.jsp");
	}

}
