package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.ClassDao;
import org.demo.entity.ClassBean;

@WebServlet("/findClass")
public class FindClass extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassDao cd=new ClassDao();
		List<ClassBean> list=cd.findClass();
		request.getSession().setAttribute("clist", list);
		request.getRequestDispatcher("addStudent.jsp").forward(request, response);
	}
	
	
}
