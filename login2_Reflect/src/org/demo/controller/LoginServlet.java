package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.bean.UserBean;
import org.demo.utils.BeanUtil;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean user=(UserBean) BeanUtil.mapping(request.getParameterMap(), UserBean.class);
		System.out.println("”√ªß√˚£∫"+user.getUname());
		System.out.println("√‹¬Î£∫"+user.getUpwd());
	}
	
}
