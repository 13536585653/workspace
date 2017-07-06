package org.users.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.users.dao.UserDao;
import org.users.entity.UserBean;

@WebServlet("/adduserServlet")
public class AddUserServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//1.����ҳ���������
		String name=request.getParameter("u_name");
		String password=request.getParameter("u_password");
		int age=Integer.parseInt(request.getParameter("u_age"));
		String address=request.getParameter("u_address");
		//2.�������е���Щ���ݷ�װ��UserBean��
		UserBean user =new UserBean();
		user.setU_name(name);
		user.setU_password(password);
		user.setU_age(age);
		user.setU_address(address);
		
		//3.�������֮�󴴽�dao���󣬽����ݲ������ݿ�
		UserDao dao =new UserDao();
		int i=dao.addUser(user);
		String msg=i==0?"���ʧ��":"��ӳɹ�";
		//4.����ʾ��Ϣ��������������
		request.setAttribute("msg", msg);
		//5.ʹ��ת��
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
	}
}
