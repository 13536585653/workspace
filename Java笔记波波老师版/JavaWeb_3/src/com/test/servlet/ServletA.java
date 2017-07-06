package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletA
 */
public class ServletA extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//读取web.xml里的servlet里的参数
		ServletConfig cfg=getServletConfig();
		String school=cfg.getInitParameter("school");
		System.out.println(school);
		
		//表单提交的用户名
		String name=request.getParameter("name");

		//将信息存入request
		request.setAttribute("school",school);
		
		//转发到servletB
		request.getRequestDispatcher("b").forward(request, response);
		

	}
	

   

}
