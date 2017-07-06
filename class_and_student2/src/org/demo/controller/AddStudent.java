package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.StudentDao;
import org.demo.entity.ClassBean;
import org.demo.entity.StudentBean;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/addStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String sname=request.getParameter("sname");
			int sage=Integer.parseInt(request.getParameter("sage"));
			String ssex=request.getParameter("ssex");
			String cname=request.getParameter("cname");
			ClassBean cb=new ClassBean();
			cb.setCname(cname);
			
			StudentBean sb=new StudentBean();
			sb.setSname(sname);
			sb.setSage(sage);
			sb.setSsex(ssex);
			sb.setCname(cb);
			
			StudentDao sd=new StudentDao();
			int i=sd.addStudent(sb);
			String msg=i==0?"添加失败":"添加成功";
			System.out.println(msg);
			request.setAttribute("smsg", msg);
			request.getRequestDispatcher("findStudent").forward(request, response);
		}
	}

