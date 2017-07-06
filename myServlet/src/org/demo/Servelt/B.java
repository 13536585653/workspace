package org.demo.Servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/b")
public class B extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		
		int n=(int) request.getAttribute("key");
		System.out.println(name);
		System.out.println(pwd);
		System.out.println(n);
		System.out.println();
		
		System.out.println("woshi ");
	}
}
