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
		
		//获取提交的bb_id
		int bb_id=Integer.parseInt(request.getParameter("bb_id"));
		
		//实例化一个bbservice对象，并调用删除方法
		BbService bbservice=new BbService();
		bbservice.deleteBb(bb_id);
		
		response.sendRedirect("superviseServlet");
	}
}
