package com.test.Servlet;

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
		String name=request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//���session
		HttpSession session=request.getSession();
		//���û�������session
		session.setAttribute("name",name);
		
		//���sessionID
		String sessionId=session.getId();
		
		out.print(name+":  ��ѡ���㹺�����Ʒ<br><br>");
		out.print("<h2>"+sessionId+"</h2>");
		out.print("<form method='post' action='b'>");
		out.print("<input type='checkbox' name='product' value='����'>����");
		out.print("<input type='checkbox' name='product' value='����'>����");
		out.println("<input type='checkbox' name='product' value='����'>����");
		out.println("<input type='submit' value='����'>");
		out.println("</form>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
