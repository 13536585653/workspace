package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.CartItem;
import com.test.bean.Product;

/**
 * Servlet implementation class ShowCart
 */
public class ShowCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//从session里，取出购物车,显示在页面上
		Map<String,CartItem> cartMap=(Map<String,CartItem>) request.getSession().getAttribute("cartMap");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//从session里取得用户名
		String name=(String) request.getSession().getAttribute("name");
	
		if(cartMap==null){
		
			out.print(name+"你还没有购物");
		
		}else{
			out.print("<h3>"+name+"的购物车列表如下:</h3>");
			out.print("<table border=1 width='800px'>");
			out.print("<tr>");
			out.print("<td>编号</td>");
			out.print("<td>名称</td>");
			out.print("<td>描述</td>");
			out.print("<td>价格</td>");
			out.print("<td>数量</td>");
			out.print("<td>合计</td>");
			out.print("<td>删除</td>");
			out.print("</tr>");
			
			double t=0;  //总金额
			//得到map里全部的key 
			Set<String> keys=cartMap.keySet();
	         
			for (String  key : keys) {
				out.print("<tr>");
				out.print("<td>"+cartMap.get(key).getP().getProId()+"</td>");
				out.print("<td>"+cartMap.get(key).getP().getProName()+"</td>");
				out.print("<td>"+cartMap.get(key).getP().getProDesc()+"</td>");
				out.print("<td>"+cartMap.get(key).getP().getProPrice()+"</td>");
				out.print("<td>"+cartMap.get(key).getNum()+"</td>");
				out.print("<td>"+cartMap.get(key).getSum()+"</td>");
				out.print("<td><a href='delCart?pid="+cartMap.get(key).getP().getProId()+"'>删除</a></td>");
				out.print("</tr>");
				t+=cartMap.get(key).getSum();   //累加
			}
			
			out.print("</table>");  
			out.print("<p>总金额："+t);
		}
		
		out.print("<p><a href='../index'>继续购买</a>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
