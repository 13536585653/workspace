package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.BtDao;
import org.demo.entity.BookType_Bean;
import org.demo.entity.UserBean;
import org.demo.service.LoginService;

@WebServlet("/u_regServlet")
public class U_regServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException{
		String Name=request.getParameter("name");
		String Pwd=request.getParameter("pwd");
		UserBean user=new UserBean();
		user.setU_name(Name);
		user.setU_password(Pwd);
		LoginService service=new LoginService();
		user=service.checkUser(user);
		System.out.println(user);
		
		if(user==null){
			request.setAttribute("msg", "用户名或密码输入错误");
			request.getRequestDispatcher("u_reg.jsp").forward(request, response);
		}else{
			//在页面加载之前将全部书类查出来
			BtDao dao=new BtDao();
			List<BookType_Bean> list=dao.findAllType();
			request.getSession().setAttribute("types", list);
			
			request.setAttribute("user", user);
			request.getRequestDispatcher("btb.jsp").forward(request, response);
		}
		
	}
}
