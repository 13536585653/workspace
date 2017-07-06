package org.users.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.users.entity.UserBean;
import org.users.service.LoginService;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//获取客户端输入进来的用户名和密码
		String UserName=request.getParameter("UserName");
		String pwd=request.getParameter("pwd");
		
		//把客户端输入的用户名和密码封装成一个对象
		UserBean user=new UserBean();
		user.setU_name(UserName);
		user.setU_password(pwd);
		
		LoginService service=new LoginService();
		//调用LoginService的checkUser的方法，保存给user
		user=service.checkUser(user);
		//如果在数据库中没有找到这个user（添加到在数据库的），就提示用户名或密码错误，转发到login.jsp页面
		if(user==null){
			request.setAttribute("msg", "用户名或密码错误！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			//否则就是找到了这个user，将它存入session里面，在转发到findAllUserServlet页面进行查询全部的用户
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("findAllUserServlet").forward(request, response);
			
		}
	}
}
