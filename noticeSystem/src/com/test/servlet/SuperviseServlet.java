package com.test.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Bulletin_board;
import com.test.service.BbService;
@WebServlet("/admin/superviseServlet")
public class SuperviseServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		//ʵ����һ��bbservice���󣬲����ò�ѯ������
		BbService bbservice=new BbService();
		List newbb=bbservice.checkBb1();
		//��newbb����session�У����ض���supervise.jsp��
		request.getSession().setAttribute("newbb", newbb);
		response.sendRedirect("supervise.jsp");
		
	}

}
