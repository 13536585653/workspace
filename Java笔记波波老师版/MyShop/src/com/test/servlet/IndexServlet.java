package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Product;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//取出商品列表
		List<Product> productList=(List<Product>) request.getServletContext().getAttribute("productList");
 		
		
		//循环输出到页面
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//从session里取得用户名
		String name=(String) request.getSession().getAttribute("name");
		
		if(name!=null && name.length()!=0){
			
			out.print("<h4>欢迎"+name+"光临商场</h4>");
		}
		
		out.print("<a href='cart/showCart'>查看购物车</a>");
		out.print("<form action='cart/addCart' method='post'>");
		out.print("<table border=1 width='800px'>");
		out.print("<tr>");
		out.print("<td>编号</td>");
		out.print("<td>名称</td>");
		out.print("<td>描述</td>");
		out.print("<td>价格</td>");
		out.print("<td>请选择</td>");
		out.print("</tr>");
		
		for (Product p : productList) {
			
			out.print("<tr>");
			out.print("<td>"+p.getProId()+"</td>");
			out.print("<td>"+p.getProName()+"</td>");
			out.print("<td>"+p.getProDesc()+"</td>");
			out.print("<td>"+p.getProPrice()+"</td>");
			out.print("<td><input type='checkbox' name='proId' value='"+p.getProId()+"'></td>");
			out.print("</tr>");
			
		}
		
		
		out.print("</table>");
		out.print("<input type='submit' value='购买'>");
		out.print("</form");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
