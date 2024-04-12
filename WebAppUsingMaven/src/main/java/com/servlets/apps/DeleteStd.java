package com.servlets.apps;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.opers.StdOperations;

/**
 * Servlet implementation class DeleteStd
 */
public class DeleteStd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rno = request.getParameter("rno");
		StdOperations  stdOper = new StdOperations();
		int r = stdOper.DeleteStudent(Integer.parseInt(rno));
		if(r>=1)
			response.sendRedirect("ViewStudents");
	}

}
