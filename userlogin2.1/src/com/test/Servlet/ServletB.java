package com.test.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

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
		response.setContentType("text/html");
		//通过httpsession获取到用户名
		String name=(String) request.getSession().getAttribute("name");
		//得到sessionId
		String sessionId=request.getSession().getId();
		
		PrintWriter out=response.getWriter();
		String[] products=request.getParameterValues("product");
		
		out.print("您的Id为："+sessionId+"<br/><br/>");
		out.print("<b>"+name+"</b>,您好:<br/>");
		out.print("您此次购买的产品有：<b>"+Arrays.toString(products)+"<br/>");
		out.print("<br/>欢迎下次光临！");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
