package org.demo.test;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test")
public class TestServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	/**
	 * 请求监听
	 */
			System.out.println("处理请求！");
			//将数据存入请求作用域
			request.setAttribute("name", "yw");
			request.setAttribute("name", "夏天");
			
			//从请求作用域中移除数据
			request.removeAttribute("name");
			System.out.println();
			System.out.println();
	/**
	 * Session监听		
	 */
			//当调用了request.getSession()方法时
			//会首先检查之前是否创建过一个session，如果没有则创建一个session实例
			//否则直接获取之前创建好的 session对象来使用
				
			HttpSession session=request.getSession();
			//存数据
			session.setAttribute("Name", "Yw");
			//替换session作用域中key为Name的数据
			session.setAttribute("Name", "夏天");
			//移除session中的数据
			session.removeAttribute("Name");
			//立即让session失效
			session.invalidate();
			System.out.println();
			System.out.println();
	/**
	 * 上下文监听
	 */
			ServletContext ct=request.getServletContext();
			//存数据
			ct.setAttribute("YY", "yw");
			//替换上下文作用域中key为YY的数据
			ct.setAttribute("YY", "狼野");
			//移除上下文作用域中的数据
			ct.removeAttribute("YY");
	}
}
