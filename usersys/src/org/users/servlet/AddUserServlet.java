package org.users.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.users.dao.UserDao;
import org.users.entity.UserBean;

@WebServlet("/adduserServlet")
public class AddUserServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//1.接受页面表单的数据
		String name=request.getParameter("u_name");
		String password=request.getParameter("u_password");
		int age=Integer.parseInt(request.getParameter("u_age"));
		String address=request.getParameter("u_address");
		//2.将请求中的这些数据封装到UserBean中
		UserBean user =new UserBean();
		user.setU_name(name);
		user.setU_password(password);
		user.setU_age(age);
		user.setU_address(address);
		
		//3.填充从完成之后创建dao对象，将数据插入数据库
		UserDao dao =new UserDao();
		int i=dao.addUser(user);
		String msg=i==0?"添加失败":"添加成功";
		//4.将提示信息放入请求作用域
		request.setAttribute("msg", msg);
		//5.使用转发
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
	}
}
