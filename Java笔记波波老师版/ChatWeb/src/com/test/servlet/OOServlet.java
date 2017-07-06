package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OOServlet
 */
public class OOServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OOServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//从ctx里取出用户列表
		List<String> userList=(List<String>) request.getServletContext().getAttribute("userList");
		
		if(userList==null)
			userList=new ArrayList<String>();
		
		//从session里取出name
		String name=(String) request.getSession().getAttribute("name");
		
		response.setContentType("text/html");
		//循环输出用户列表
		PrintWriter out=response.getWriter();
		out.print("<h3>当前在线用户</h3>");
		for (String user : userList) {
			
			if(user.equals(name))
			    out.print("<br><font color='red'>"+user+"</font>");
			else
				 out.print("<br><font color='black'>"+user+"</font>");	
		}
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		   this.doGet(request, response);

	}

}
