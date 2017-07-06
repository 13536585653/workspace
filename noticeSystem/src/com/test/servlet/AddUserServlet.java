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
		//�������е����ݷ�װ��Ϊһ��users����
		Users users=BeanUtil.toBean(request.getParameterMap(), Users.class);
		
		//ʵ����һ��admindao���󣬲�����������û�������
		AdminService adminservice=new AdminService();
		Users newusers=adminservice.addUser(users);
		
		if(newusers!=null){
			request.setAttribute("meg", "�û��Ѵ��ڣ�����<a href='addUser.jsp'>���</a>");
			request.getRequestDispatcher("message.jsp").forward(request, response);
		}else{
			request.setAttribute("meg", "��ӳɹ�������<a href='addUser.jsp'>���</a>");
			request.getRequestDispatcher("message.jsp").forward(request, response);
		}
	}
}
