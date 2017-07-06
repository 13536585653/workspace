package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.entity.User;
import org.demo.service.LoginService;
import org.demo.utils.BeanUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		User user=BeanUtil.toBean(request.getParameterMap(), User.class);
		System.out.println(user);
		LoginService ls=new LoginService();
		user=ls.checkUser(user);
		if(user==null){
			//用户为空，表示验证没通过，用户名或密码不正确
			//将错误信息放入到请求作用域，并转发到登入页面提示
			request.setAttribute("msg", "用户名或密码不正确！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			//验证通过后，将用户放入会话作用域，在后续的功能实现中会用到用户的信息
			request.getSession().setAttribute("user", user);
			//转发到主页面
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
}
