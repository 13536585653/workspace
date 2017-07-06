package org.users.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.users.entity.UserBean;
import org.users.service.LoginService;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//��ȡ�ͻ�������������û���������
		String UserName=request.getParameter("UserName");
		String pwd=request.getParameter("pwd");
		
		//�ѿͻ���������û����������װ��һ������
		UserBean user=new UserBean();
		user.setU_name(UserName);
		user.setU_password(pwd);
		
		LoginService service=new LoginService();
		//����LoginService��checkUser�ķ����������user
		user=service.checkUser(user);
		//��������ݿ���û���ҵ����user����ӵ������ݿ�ģ�������ʾ�û������������ת����login.jspҳ��
		if(user==null){
			request.setAttribute("msg", "�û������������");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			//��������ҵ������user����������session���棬��ת����findAllUserServletҳ����в�ѯȫ�����û�
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("findAllUserServlet").forward(request, response);
			
		}
	}
}
