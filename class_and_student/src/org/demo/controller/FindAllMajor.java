package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.MajorDao;
import org.demo.entity.MajorBean;

@WebServlet("/findAllMajor")
public class FindAllMajor extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MajorDao md=new MajorDao();
		List<MajorBean>list=md.findAllMajor();
		for (MajorBean mb : list) {
			System.out.println(mb);
		}
		request.getSession().setAttribute("mlist", list);
		request.getRequestDispatcher("addStudent.jsp").forward(request, response);
	}
		
}
