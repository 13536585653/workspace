package org.users.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.users.dao.UserDao;
import org.users.entity.UserBean;
import org.users.utils.BeanUtil;

@WebServlet("/findAllUserServlet")
public class FindAllUserServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//��ȡȫ���û�������ֵ
		//User user1=BeanUtil.toBean(request.getParameterMap(), User.class);
		//����dao���󣬲�ѯ�����û�
		UserDao dao=new UserDao();
		List<UserBean> list=dao.findAllUser();
		//���������ݷ��뵽����������
		request.setAttribute("AllUserList", list);
		//ת����index.jspҳ����ʾ
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
