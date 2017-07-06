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
		
		//дһ��session����
		HttpSession s=request.getSession();
		//��ȡsessionID
		String sid1=s.getId();
		System.out.println(sid1);
		
		
		//�ӻỰ����ȡֵ
		String name=(String) s.getAttribute("my");
		//���ֵ
		System.out.println(name);
	}
}
