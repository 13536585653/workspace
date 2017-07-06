package com.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//得到用户名和密码
		String name=request.getParameter("username");
		String pwd=request.getParameter("password");
		
		//验证
		if("admin".equals(name) && "123456".equals(pwd)){
			
			System.out.println("验证成功");
			
			HttpSession session=request.getSession();
			session.setAttribute("name", name);
			
			//转发
			request.getRequestDispatcher("main/mainServlet").forward(request, response);
			
			
		}else{
			
			System.out.println("验证失败");
			//重定向
			response.sendRedirect("error.html");
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
