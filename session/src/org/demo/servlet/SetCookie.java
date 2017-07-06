package org.demo.servlet;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/setcookie")
public class SetCookie extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServerException,IOException{
		//����һ��cookie����
		Cookie cookie=new Cookie("name","wangzai");
		//����cookie������ʱ��
		cookie.setMaxAge(60);
		//���ͨ��response����cookie����д�������
		response.addCookie(cookie);
	}

}
