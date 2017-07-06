package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get«Î«Û
		/*String Gname=request.getParameter("uname");
		Gname+=",hello";
		System.out.println(Gname);
		response.setContentType("text/hmtl;charset=utf-8");
		response.getWriter().println(Gname);
		*/
		//post«Î«Û
		String Pname=request.getParameter("i");
		Pname+=",hi";
		System.out.println(Pname);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(Pname);
		//response.getWriter().println(Pname);
	}
	
}
