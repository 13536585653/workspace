package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.StudentDao;
import org.demo.entity.ClassBean;
import org.demo.entity.MajorBean;
import org.demo.entity.StudentBean;
import org.junit.Test;

@WebServlet("/addStudent")
public class AddStudent extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	@Test
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname=request.getParameter("sname");
		int sage=Integer.getInteger(request.getParameter("sage"));
		System.out.println(sage);
		String ssex=request.getParameter("ssex");
		String cname=request.getParameter("cname");
		String mname=request.getParameter("mname");
		

		ClassBean cb=new ClassBean();
		cb.setCname(cname);
		MajorBean mb=new MajorBean();
		mb.setMname(mname);
		StudentBean sb=new StudentBean();
		sb.setSname(sname);
	    sb.setSage(sage);
		sb.setSsex(ssex);
		sb.setCname(cb);
		sb.setMname(mb);
		StudentDao sd=new StudentDao();
		int i=sd.addStudent(sb);
		String msg=i==0?"添加学生失败":"添加学生成功";
		request.setAttribute("msg", msg);
		System.out.println(msg);
		request.getRequestDispatcher("addStudent.jsp").forward(request, response);
	}
	

}
