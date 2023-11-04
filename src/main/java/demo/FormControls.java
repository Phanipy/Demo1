package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormControls
 */
@WebServlet("/FormControls")
public class FormControls extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormControls() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String name=request.getParameter("name");
	String saluation=request.getParameter("saluation");//dropdown
	String lang[]=request.getParameterValues("lang");
	String country=request.getParameter("country");
	
	out.println("Name: "+name);
	out.println("Saluation: "+saluation);
	
	
	for(int i=0;i<lang.length;i++)
	{
	out.println("Languages: "+lang[i]);
	}
	
	
	
	out.println("Country"+country);
	

	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
