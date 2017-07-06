package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.MajorDao;
import org.demo.entity.MajorBean;

@WebServlet("/addMajor")
public class AddMajor extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mname=request.getParameter("mname");
		String mIntroduce=request.getParameter("mIntroduce");
		MajorBean mb=new MajorBean();
		mb.setMname(mname);
		mb.setmIntroduce(mIntroduce);
		MajorDao md=new MajorDao();
		int i=md.addMajor(mb);
		String msg=i==0?"添加专业失败":"添加专业成功";
		System.out.println(msg);
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("findAllMajor").forward(request, response);
	}
	
}
