package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
       
        System.out.println("servletA ������");
    }

    
    
    
    
	@Override
	public void init() throws ServletException {
	
		super.init();
		
		System.out.println("servlet�ĳ�ʼ��.....");
	}





	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	      System.out.println("service����.....");
	      
	         req.setCharacterEncoding("utf-8");
	         resp.setContentType("text/html;charset=utf-8");
	         
	         //�õ����ύ��ֵ
	         String name=req.getParameter("name");
	         String address=req.getParameter("address");
	         String sex=req.getParameter("sex");
	         String city=req.getParameter("city");
	         
	         String[] funs=req.getParameterValues("fun");
	         
	         //�õ��ͻ���ip��ַ
	         String ip=req.getRemoteAddr();
	         System.out.println("�ͻ���ip:"+ip);
	         
	         //�õ������url
	         String url=req.getRequestURI();
	         System.out.println("���ʵ�url:"+url);
	         
	         
	         System.out.println(name+":"+address+":"+sex+":"+city);
	         
	         PrintWriter out=resp.getWriter();
	         out.print("<p>����:"+name);
	         out.print("<p>��ַ:"+address);
	         out.print("<p>�Ա�:"+sex);
	         out.print("<p>����:"+city);
	         out.print("<p>����:");
	         /*for (String fun : funs) {
	        	 out.print(fun+",");
			 }*/
	         
	         out.print(Arrays.toString(funs));
	         
	         out.close();
	
	}





	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("��������......");
	}





	
}
