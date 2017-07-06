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
       
        System.out.println("servletA 生成了");
    }

    
    
    
    
	@Override
	public void init() throws ServletException {
	
		super.init();
		
		System.out.println("servlet的初始化.....");
	}





	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	      System.out.println("service方法.....");
	      
	         req.setCharacterEncoding("utf-8");
	         resp.setContentType("text/html;charset=utf-8");
	         
	         //得到表单提交的值
	         String name=req.getParameter("name");
	         String address=req.getParameter("address");
	         String sex=req.getParameter("sex");
	         String city=req.getParameter("city");
	         
	         String[] funs=req.getParameterValues("fun");
	         
	         //得到客户机ip地址
	         String ip=req.getRemoteAddr();
	         System.out.println("客户机ip:"+ip);
	         
	         //得到请求的url
	         String url=req.getRequestURI();
	         System.out.println("访问的url:"+url);
	         
	         
	         System.out.println(name+":"+address+":"+sex+":"+city);
	         
	         PrintWriter out=resp.getWriter();
	         out.print("<p>姓名:"+name);
	         out.print("<p>地址:"+address);
	         out.print("<p>性别:"+sex);
	         out.print("<p>城市:"+city);
	         out.print("<p>爱好:");
	         /*for (String fun : funs) {
	        	 out.print(fun+",");
			 }*/
	         
	         out.print(Arrays.toString(funs));
	         
	         out.close();
	
	}





	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("被销毁了......");
	}





	
}
