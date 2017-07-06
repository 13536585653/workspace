package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.UserDao;
import org.demo.entity.UserBean;

import com.google.gson.Gson;

@WebServlet("/findUser")
public class FindUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao dao =new UserDao();
		List<UserBean> list=dao.findAllUser();
		System.out.println(list.size());
		//将list转换成json字符串
		String json=new Gson().toJson(list);
		System.out.println();
		//使用response响应回客户端
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(json);
		//response.getWriter().println(json);
	}
	
}
