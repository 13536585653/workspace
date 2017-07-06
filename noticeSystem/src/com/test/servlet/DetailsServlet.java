package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.service.BbService;
@WebServlet("/admin/detailsServlet")
public class DetailsServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		//��ȡ�ύ��bb_id
		int bb_id=Integer.parseInt(request.getParameter("bb_id"));
		
		//ʵ����һ��bbservice���󣬲����ò�ѯ����
		BbService bbservice=new BbService();
		String message=bbservice.checkBb2(bb_id);
		
		request.getSession().setAttribute("details", message);
		response.sendRedirect("details.jsp");
		System.out.println(bb_id);
	}
}
