package com.servlets.apps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.entities.Student;
import com.servlets.opers.StdOperations;

/**
 * Servlet implementation class ModifyStd
 */
public class ModifyStd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyStd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rno = request.getParameter("txtRno");
		String sname = request.getParameter("txtStdName");
		String course = request.getParameter("ddlCourse");
		String fees = request.getParameter("txtFees");
		
		Student std = null;

		std = new Student();
		std.setRollno(Integer.parseInt(rno));
		std.setStdname(sname);
		std.setCourse(course);
		std.setFees(Float.parseFloat(fees));
		
		StdOperations  stdoper = new StdOperations();
		
		if(stdoper.UpdateStudent(std)>=1)
		{
			response.sendRedirect("ViewStudents");
		}
		//System.out.println(rno + " " + sname + " " + course + " " + fees);		
	}
}
