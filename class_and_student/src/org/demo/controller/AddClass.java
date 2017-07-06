package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.ClassDao;
import org.demo.entity.ClassBean;

@WebServlet("/addClass")
public class AddClass extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cname=request.getParameter("cname");
		ClassBean cb=new ClassBean();
		cb.setCname(cname);
		ClassDao cd=new ClassDao();
		int i=cd.addClass(cb);
		String msg1=i==0?"添加班级失败":"添加班级成功";
		System.out.println(msg1);
		request.setAttribute("msg1", msg1);
		request.getRequestDispatcher("findAllClass").forward(request, response);
	}
	
}
