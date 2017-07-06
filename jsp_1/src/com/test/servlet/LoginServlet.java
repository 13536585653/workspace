package com.test.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

            String name=request.getParameter("username");
            if(name!=null){
            	request.getSession().setAttribute("username",name);
            	response.sendRedirect("index.jsp");
            }else{
            	response.sendRedirect("login.html");
            }
            
            
            //将一个字符串列表存入cxt
            
            String aa="aa";
            String bb="bb";
            String cc="cc";
            
            List<String> list=new ArrayList<String>();
            
            list.add(aa);
            list.add(bb);
            list.add(cc);
            
            request.getServletContext().setAttribute("list", list);
            
            
            
            
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
		
	}

}
