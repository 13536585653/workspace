package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.MessageDao;
import org.demo.entity.MessageBean;

@WebServlet("/findMessage")
public class FindMessage extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MessageDao md=new MessageDao();
		List<MessageBean> list=md.findMessage();
		for (MessageBean mb : list) {
			System.out.println(mb.getMcontent());
			System.out.println(mb.getPublish());
		}
		request.getSession().setAttribute("mlist", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
}
