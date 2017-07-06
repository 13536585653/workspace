package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.BDao;
import org.demo.entity.Books_Bean;

@WebServlet("/findBooksServlet")
public class FindBooksServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		BDao dao=new BDao();
		List<Books_Bean> list=dao.findAllBooks();
		request.getSession().setAttribute("books", list);
		System.out.println(list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
