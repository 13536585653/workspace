package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Admins;
import com.test.service.AdminService;
import com.test.util.BeanUtil;
@WebServlet("/regServlet")
public class A_RegServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		//将请求中的数据封装成admin对象
		Admins admin=BeanUtil.toBean(request.getParameterMap(), Admins.class);
		
		//实例化一个adminService对象，并调用检查方法
		AdminService adminService=new AdminService();
		Admins newadmin=adminService.checkAdmin(admin);
		
		//判断该admin是否存在
		if(newadmin!=null){
			request.setAttribute("msg", "用户名已存在！");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}else{
			adminService.addAdmin(admin);
			request.setAttribute("msg", "注册成功！");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
	}
}
