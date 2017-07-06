package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.MyScoreDao;
import org.demo.entity.MyScoreBean;

@WebServlet("/findMyScore")
public class FindMyScore extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyScoreDao msd=new MyScoreDao();
		List<MyScoreBean> list=msd.findMyScore();
		for (MyScoreBean msb : list) {
			System.out.println(msb.getProject().getProjectname());
		}
		request.getSession().setAttribute("mlist", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
