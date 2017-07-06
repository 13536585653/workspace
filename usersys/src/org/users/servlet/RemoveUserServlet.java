package org.users.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.users.service.RemoveUserService;

@WebServlet("/removeUserServlet")
public class RemoveUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//获取页面表单数据
		String []u_id=request.getParameterValues("uids");
		
		//new一个service对象
		RemoveUserService service =new RemoveUserService();
		//将表单数据交给业务层处理
		service.RemoveUser(u_id);
		//作比较
		//String msg= rows ==null?"删除失败":"删除成功";
		//System.out.println(msg);
		
		//转发到findAllUser页面
		request.getRequestDispatcher("findAllUserServlet").forward(request, response);
	}
}
