package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.entity.User;
import org.demo.service.LoginService;
import org.demo.utils.BeanUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		User user=BeanUtil.toBean(request.getParameterMap(), User.class);
		System.out.println(user);
		LoginService ls=new LoginService();
		user=ls.checkUser(user);
		if(user==null){
			//�û�Ϊ�գ���ʾ��֤ûͨ�����û��������벻��ȷ
			//��������Ϣ���뵽���������򣬲�ת��������ҳ����ʾ
			request.setAttribute("msg", "�û��������벻��ȷ��");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			//��֤ͨ���󣬽��û�����Ự�������ں����Ĺ���ʵ���л��õ��û�����Ϣ
			request.getSession().setAttribute("user", user);
			//ת������ҳ��
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
}
