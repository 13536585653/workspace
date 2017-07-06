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
		//����һ��session����
		HttpSession s=request.getSession();
		//Ϊsession���ó�ʱʱ��
		s.setMaxInactiveInterval(30);
		//��ȡsession��id
		String sid=s.getId();
		System.out.println(sid);
		//��ֵ
		s.setAttribute("my", "wangzai");
		//ת��
		//request.getRequestDispatcher("demo").forward(request, response);
		//ִ��url��д��������ض�����Ҫ����url��д
		String url=response.encodeRedirectURL("demo");
		//ִ���ض���
		response.sendRedirect(url);		
		
		//��ҳ�������Ҫ����URL��д
//		PrintWriter pw=response.getWriter();
//		pw.println("<html>");
//		pw.println("<a href="+response.encodeURL("demo")+">test</a>");
//		pw.println("<a href="+response.encodeURL("demo")+">test</a>");
//		pw.println("<a href="+response.encodeURL("demo")+">test</a>");
//		pw.print("<html>");
	}
}
