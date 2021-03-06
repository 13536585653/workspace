package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletB
 */
public class ServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//从request里获取值
		String name=request.getParameter("name");
		String school=(String) request.getAttribute("school");
		
		
		
		//获得servletContext
		ServletContext ctx=request.getServletContext();
		
		//往servletContext存入东西
		ctx.setAttribute("name", name);
		ctx.setAttribute("school", school);
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.print("<h2>servletB</h2>");
		out.print("<p>"+name);
		out.print("<p>"+school);
		out.print("<p><a href='c'>servletC</a>");
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
