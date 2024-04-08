import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page2
 */
@WebServlet("/Page2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String pname = request.getParameter("txtName");
		String gender = request.getParameter("rdoGen");
		String location = request.getParameter("ddlLoc");
		String grd = request.getParameter("chk1");
		out.print("<h1>Person Name is : " + pname + "</h1>");
		out.print("<h2>Gender : " + gender + "</h2>");
		out.print("<h2>Location : " + location + "</h2>");
		if(grd==null)
			out.print("<h2>Person is Not Graduated</h2>");
		
		if(grd.equals("on")==true)
			out.print("<h2>Person is Graduated</h2>");
		
		
		
	}

}
