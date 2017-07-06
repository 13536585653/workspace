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
		//�����ڿͻ�����ʾֵ��
		PrintWriter pw=response.getWriter();
		//����������л��cookies
		Cookie[] cookies=request.getCookies();
		for (Cookie cookie : cookies) {
			if("name".equals(cookie.getName())){
				//�ڿ���̨���value
				//System.out.println(cookie.getValue());
				//�ڿͻ������value
				pw.println(cookie.getValue());
				break;
			}
		
		
		}
	}
}
