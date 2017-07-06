package org.users.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.users.dao.UserDao;
import org.users.entity.UserBean;
import org.users.utils.BeanUtil;

@WebServlet("/findAllUserServlet")
public class FindAllUserServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//获取全部用户的属性值
		//User user1=BeanUtil.toBean(request.getParameterMap(), User.class);
		//创建dao对象，查询所有用户
		UserDao dao=new UserDao();
		List<UserBean> list=dao.findAllUser();
		//将集合数据放入到请求作用域
		request.setAttribute("AllUserList", list);
		//转发到index.jsp页面显示
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
