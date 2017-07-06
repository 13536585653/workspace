package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.BtDao;
import org.demo.entity.BookType_Bean;

@WebServlet("/findBookType")
public class FindBookType extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BtDao dao=new BtDao();
		List<BookType_Bean> list=dao.findAllType();
		//将集合放入会话作用域
		request.getSession().setAttribute("types", list);
		request.getRequestDispatcher("btb.jsp").forward(request, response);
	}
	
}
