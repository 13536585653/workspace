package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Users;
import com.test.dao.AdminDao;
import com.test.service.AdminService;
import com.test.util.BeanUtil;
@WebServlet("/admin/addUserServlet")
public class AddUserServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		//将请求中的数据封装成为一个users对象
		Users users=BeanUtil.toBean(request.getParameterMap(), Users.class);
		
		//实例化一个admindao对象，并调用其插入用户发方法
		AdminService adminservice=new AdminService();
		Users newusers=adminservice.addUser(users);
		
		if(newusers!=null){
			request.setAttribute("meg", "用户已存在，重新<a href='addUser.jsp'>添加</a>");
			request.getRequestDispatcher("message.jsp").forward(request, response);
		}else{
			request.setAttribute("meg", "添加成功，继续<a href='addUser.jsp'>添加</a>");
			request.getRequestDispatcher("message.jsp").forward(request, response);
		}
	}
}
