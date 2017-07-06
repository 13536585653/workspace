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
		
		//获取提交的bb_id
		int bb_id=Integer.parseInt(request.getParameter("bb_id"));
		
		//实例化一个bbservice对象，并调用查询方法
		BbService bbservice=new BbService();
		String message=bbservice.checkBb2(bb_id);
		
		request.getSession().setAttribute("details", message);
		response.sendRedirect("details.jsp");
		System.out.println(bb_id);
	}
}
