package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/demo")
public class DemoServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		//写一个session对象
		HttpSession s=request.getSession();
		//获取sessionID
		String sid1=s.getId();
		System.out.println(sid1);
		
		
		//从会话域中取值
		String name=(String) s.getAttribute("my");
		//输出值
		System.out.println(name);
	}
}
