package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Bulletin_board;
import com.test.service.BbService;
import com.test.util.BeanUtil;
@WebServlet("/admin/addNoticeServlet")
public class AddNoticeServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		//�������е� ���ݷ�װ��һ��bulletin_board����
		Bulletin_board bb=BeanUtil.toBean(request.getParameterMap(), Bulletin_board.class);
		
		//ʵ����һ��bbservice���󣬲���ѯ�ù����Ƿ����
		BbService bbservice=new BbService();
		Bulletin_board newbb=bbservice.checkBb(bb);
		
		if(newbb!=null){
			request.setAttribute("meg", "�����Ѵ��ڣ���������<a href='addNotice.jsp'>���</a>");
			request.getRequestDispatcher("message.jsp").forward(request,response);
		}else{
			bbservice.addBb(bb);
			request.getSession().setAttribute("bb", bb);
			request.setAttribute("meg", "��ӳɹ����鿴<a href='superviseServlet'>������</a>");
			request.getRequestDispatcher("message.jsp").forward(request,response);
		}
	}
}
