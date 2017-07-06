package org.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.UserDao;
import org.demo.entity.UserBean;

@WebServlet("/findAllUserServlet")
public class FindAllUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao dao=new UserDao();
		List<UserBean> list=dao.findAllUser();
		request.setAttribute("AllUserList", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
}
