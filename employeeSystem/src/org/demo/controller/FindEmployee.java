package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.EmployeeDao;
import org.demo.entity.EmployeeBean;

@WebServlet("/findEmployee")
public class FindEmployee extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		EmployeeDao ed=new EmployeeDao();
		List<EmployeeBean> list=ed.findEmployee();
		request.getSession().setAttribute("elist", list);
		for (EmployeeBean eb : list) {
			System.out.println(eb.getEname());
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
