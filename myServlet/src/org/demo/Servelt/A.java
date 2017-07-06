package org.demo.Servelt;

import java.io.IOException;
import java.rmi.ServerException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;


@WebServlet("/a")
public class A extends HttpServlet{
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		
		System.out.println("name   :"+name);
		System.out.println("pwd    :"+pwd);
		
		//设置作用域
		request.setAttribute("key", 33);
		//转发
		request.getRequestDispatcher("b").forward(request, response);
		//重定向
		//response.sendRedirect("b");
	}
		
	
}
