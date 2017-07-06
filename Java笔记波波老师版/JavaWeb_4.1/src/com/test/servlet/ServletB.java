package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		
		//从session里得到用户名
		String name=(String) request.getSession().getAttribute("name");
		
		//得到sessionId
		String sessionId=request.getSession().getId();
	
		
		//得到用户选择的商品
		String[] products=request.getParameterValues("product");
		
		//将数组转成字符串
		String s=Arrays.toString(products);
		
		response.setContentType("text/html");
		PrintWriter  out=response.getWriter();
		out.print("<h2>"+sessionId+"</h2>");
		out.print("<h2>"+name+"你选购的商品如下:</h2");
		out.print("<p>"+s);
		out.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
