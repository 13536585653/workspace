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
		//�������е����ݷ�װ��admin����
		Admins admin=BeanUtil.toBean(request.getParameterMap(), Admins.class);
		
		//ʵ����һ��adminService���󣬲����ü�鷽��
		AdminService adminService=new AdminService();
		Admins newadmin=adminService.checkAdmin(admin);
		
		//�жϸ�admin�Ƿ����
		if(newadmin!=null){
			request.setAttribute("msg", "�û����Ѵ��ڣ�");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}else{
			adminService.addAdmin(admin);
			request.setAttribute("msg", "ע��ɹ���");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
	}
}
