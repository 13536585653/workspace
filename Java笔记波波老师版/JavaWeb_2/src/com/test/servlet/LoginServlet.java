package com.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//�õ��û���������
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		
	      if("admin".equals(username) &&  "123456".equals(pwd)){
				
				System.out.println("��¼�ɹ�");
				
				//ת����success.html 
	  //request.getRequestDispatcher("WEB-INF/success.html").forward(request, response);
			
				//ת����successServlet 
				request.getRequestDispatcher("b").forward(request, response);		
				
			}else{
				
				System.out.println("��¼ʧ��");
				
				//�ض���error.html
				response.sendRedirect("error.html");
				//response.sendRedirect("a");
				
			}
		
		
		
		
	}
	
       
    
	
	
	
	
}
