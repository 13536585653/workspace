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
		
		//��ȡweb.xml���servlet��Ĳ���
		ServletConfig cfg=getServletConfig();
		String school=cfg.getInitParameter("school");
		System.out.println(school);
		
		//���ύ���û���
		String name=request.getParameter("name");

		//����Ϣ����request
		request.setAttribute("school",school);
		
		//ת����servletB
		request.getRequestDispatcher("b").forward(request, response);
		

	}
	

   

}
