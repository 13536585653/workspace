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
		
		//将请求中的 数据封装成一个bulletin_board对象
		Bulletin_board bb=BeanUtil.toBean(request.getParameterMap(), Bulletin_board.class);
		
		//实例化一个bbservice对象，并查询该公告是否存在
		BbService bbservice=new BbService();
		Bulletin_board newbb=bbservice.checkBb(bb);
		
		if(newbb!=null){
			request.setAttribute("meg", "公告已存在！返回重新<a href='addNotice.jsp'>添加</a>");
			request.getRequestDispatcher("message.jsp").forward(request,response);
		}else{
			bbservice.addBb(bb);
			request.getSession().setAttribute("bb", bb);
			request.setAttribute("meg", "添加成功！查看<a href='superviseServlet'>公告栏</a>");
			request.getRequestDispatcher("message.jsp").forward(request,response);
		}
	}
}
