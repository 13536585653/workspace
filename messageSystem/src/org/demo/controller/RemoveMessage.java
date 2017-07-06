package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.service.MessageService;

@WebServlet("/removeMessage")
public class RemoveMessage extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] mid=request.getParameterValues("cb");
		MessageService ms=new MessageService();
		int[] rows=ms.removeMessage(mid);
		String msg=rows==null?"É¾³ýÊ§°Ü":"É¾³ý³É¹¦"+rows.length+"ÐÐ";
		request.setAttribute("msg", msg);
		System.out.println();
		System.out.println(rows.length);
		request.getRequestDispatcher("findMessage").forward(request, response);
	}
	
}
