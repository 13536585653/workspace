package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.EmployeeDao;
import org.demo.entity.EmployeeBean;

@WebServlet("/addEmployee")
public class AddEmployee extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String ename=request.getParameter("ename");
		int eage=Integer.parseInt(request.getParameter("eage"));
		String esex=request.getParameter("esex");
		String eemail=request.getParameter("eemail");
		
		EmployeeBean eb=new EmployeeBean();
		eb.setEname(ename);
		eb.setEage(eage);
		eb.setEsex(esex);
		eb.setEemail(eemail);
		
		EmployeeDao ed=new EmployeeDao();
		boolean i=ed.addEmployee(eb);
		String msg=i==true?"添加失败":"添加成功";
		request.setAttribute("msg", msg);
		System.out.println(msg);
		request.getRequestDispatcher("findEmployee").forward(request, response);
	}
}
