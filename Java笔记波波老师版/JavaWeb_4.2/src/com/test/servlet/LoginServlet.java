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
	
		//�õ��û���������
		String name=request.getParameter("username");
		String pwd=request.getParameter("password");
		
		//��֤
		if("admin".equals(name) && "123456".equals(pwd)){
			
			System.out.println("��֤�ɹ�");
			
			HttpSession session=request.getSession();
			session.setAttribute("name", name);
			
			//ת��
			request.getRequestDispatcher("main/mainServlet").forward(request, response);
			
			
		}else{
			
			System.out.println("��֤ʧ��");
			//�ض���
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
