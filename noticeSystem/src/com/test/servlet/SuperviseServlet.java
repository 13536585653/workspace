package com.test.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Bulletin_board;
import com.test.service.BbService;
@WebServlet("/admin/superviseServlet")
public class SuperviseServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		//实例化一个bbservice对象，并调用查询方法。
		BbService bbservice=new BbService();
		List newbb=bbservice.checkBb1();
		//将newbb存入session中，并重定向到supervise.jsp中
		request.getSession().setAttribute("newbb", newbb);
		response.sendRedirect("supervise.jsp");
		
	}

}
