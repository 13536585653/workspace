package com.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.AdminDao;

/**
 * Servlet implementation class Admin_login
 */
public class Admin_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AdminDao adminDao=new AdminDao();   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin_name=request.getParameter("admin_name");
		String admin_pwd=request.getParameter("admin_pwd");
	
		//从数据库获得用户真密码
		String real_pwd=adminDao.getPwdByName(admin_name);
		
		
		 if(real_pwd.equals(admin_pwd)){
		      //将用户名，存入session
			  request.getSession().setAttribute("admin_name", admin_name);
			  response.sendRedirect("admin/main.jsp");
		 } else{
			 response.sendRedirect("error.jsp");
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
