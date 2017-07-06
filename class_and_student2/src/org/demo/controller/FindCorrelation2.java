package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.StudentDao;
import org.demo.entity.StudentBean;

@WebServlet("/findCorrelation2")
public class FindCorrelation2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao sd=new StudentDao();
		List<StudentBean> list2=sd.findStudent1();
		for (StudentBean sb : list2) {
			System.out.println(sb.getSname());
		}
		request.getSession().setAttribute("list2", list2);
		request.getRequestDispatcher("findCorrelation2.jsp").forward(request, response);
	}
	
}
