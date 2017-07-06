package org.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcookie")
public class GetCookie extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=utf-8");
		//设置在客户端显示值；
		PrintWriter pw=response.getWriter();
		//从请求对象中获得cookies
		Cookie[] cookies=request.getCookies();
		for (Cookie cookie : cookies) {
			if("name".equals(cookie.getName())){
				//在控制台输出value
				//System.out.println(cookie.getValue());
				//在客户端输出value
				pw.println(cookie.getValue());
				break;
			}
		
		
		}
	}
}
