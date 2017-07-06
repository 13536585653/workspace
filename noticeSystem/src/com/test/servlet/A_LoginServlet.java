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
@WebServlet("/loginServlet")
public class A_LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		//���ύ�����ݷ�װ��Admins��Ķ���
		Admins admin=BeanUtil.toBean(request.getParameterMap(), Admins.class);
		
		//ʵ����һ��adminservice���󣬲����ü�鷽��
		AdminService adminservice=new AdminService();
		Admins newadmin=adminservice.checkAdmin(admin);
		
		//�ж�admin�Ƿ�Ϊ��
		if(newadmin==null){
			request.setAttribute("msg", "�û������������");
			request.getRequestDispatcher("a_login.jsp").forward(request, response);
		}else{
			request.getSession().setAttribute("a_name", admin.getA_name());
			request.setAttribute("msg", newadmin);
			request.getRequestDispatcher("admin/manage.jsp").forward(request, response);
		}
	}
}
