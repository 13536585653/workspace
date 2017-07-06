package org.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.UserDao;
import org.demo.entity.UserBean;

@WebServlet("/userLogin")
public class addUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException{
		String name=request.getParameter("name");	
		String pwd=request.getParameter("pwd");
		String sex=request.getParameter("sex");
		System.out.println("sex"+sex);
		UserBean user=new UserBean();
		user.setU_name(name);
		user.setU_pwd(pwd);
		user.setU_sex(sex);
		
		UserDao dao=new UserDao();
		int u=dao.addUser(user);
		
		String msg=u==0?"×¢²áÊ§°Ü":"×¢²á³É¹¦";
		System.out.println(msg);
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("findAllUserServlet").forward(request, response);
		
	}
}
