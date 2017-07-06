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

@WebServlet("/findAllStudent")
public class FindAllStudent extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao sd=new StudentDao();
		List<StudentBean> list=sd.findAllStudent();
		request.setAttribute("list", list);
			for (StudentBean sb : list) {
				System.out.println(sb);
			}
		request.getRequestDispatcher("index.jsp").forward(request, response);;
	}
	
}
