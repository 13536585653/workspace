package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.service.BbService;

@WebServlet("/admin/deleteServlet")
public class DeleteServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		//��ȡ�ύ��bb_id
		int bb_id=Integer.parseInt(request.getParameter("bb_id"));
		
		//ʵ����һ��bbservice���󣬲�����ɾ������
		BbService bbservice=new BbService();
		bbservice.deleteBb(bb_id);
		
		response.sendRedirect("superviseServlet");
	}
}
