package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletA
 */
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ñ��ύ���û���
		String name=request.getParameter("username");
		
		//���session
		HttpSession session=request.getSession();
		
		//���û�������session
		session.setAttribute("name", name);
		
		//���sessionId
		String sessionId=session.getId();
		
		//���
		response.setContentType("text/html");
		PrintWriter  out=response.getWriter();
		out.print("<h3>��ӭ"+name+"����ѡ����Ʒ</h3>");
		out.print("<h3>"+sessionId+"</h3>");
		out.print("<form action='b' method='post'>");
		out.print("<p>��Ʒ:");
		out.print("<p><input type='checkbox' name='product' value='�㽶'>�㽶");
		out.print("<input type='checkbox' name='product' value='ƻ��'>ƻ��");
		out.print("<input type='checkbox' name='product' value='����'>����");
		out.print("<p><input type='submit' value='�ύ'>");
		out.print("</form>");
		out.close();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
