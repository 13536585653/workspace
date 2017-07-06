package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletA
 */

public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletA() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("username");
		
        request.getServletContext().setAttribute("username", name);		
		
		response.setContentType("text/html");
		PrintWriter  out=response.getWriter();
		out.print("<h3>欢迎"+name+"，请选择商品</h3>");
		out.print("<form action='b' method='post'>");
		out.print("<p>商品:");
		out.print("<p><input type='checkbox' name='product' value='香蕉'>香蕉");
		out.print("<input type='checkbox' name='product' value='苹果'>苹果");
		out.print("<input type='checkbox' name='product' value='橙子'>橙子");
		out.print("<p><input type='submit' value='提交'>");
		out.print("</form>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
		
	}

}
