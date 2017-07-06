package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/createSession")
public class SessionServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//创建一个session对象
		HttpSession s=request.getSession();
		//为session设置超时时间
		s.setMaxInactiveInterval(30);
		//获取session的id
		String sid=s.getId();
		System.out.println(sid);
		//存值
		s.setAttribute("my", "wangzai");
		//转发
		//request.getRequestDispatcher("demo").forward(request, response);
		//执行url重写，如果是重定向，需要进行url重写
		String url=response.encodeRedirectURL("demo");
		//执行重定向
		response.sendRedirect(url);		
		
		//在页面上如果要进行URL重写
//		PrintWriter pw=response.getWriter();
//		pw.println("<html>");
//		pw.println("<a href="+response.encodeURL("demo")+">test</a>");
//		pw.println("<a href="+response.encodeURL("demo")+">test</a>");
//		pw.println("<a href="+response.encodeURL("demo")+">test</a>");
//		pw.print("<html>");
	}
}
