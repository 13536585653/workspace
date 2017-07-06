package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletD
 */
public class ServletD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得servletContext
		   ServletContext ctx=request.getServletContext();
			
			//从ctx取东西
		   String name=(String) ctx.getAttribute("name");
		   String school=(String) ctx.getAttribute("school");
			
		   response.setContentType("text/html");
			
			PrintWriter out=response.getWriter();
			out.print("<h2>servletD</h2>");
			out.print("<p>"+name);
			out.print("<p>"+school);
		    out.close();
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		this.doGet(request, response);

	}

}
