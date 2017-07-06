package com.test.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.CartItem;

/**
 * Servlet implementation class delCart
 */
public class DelCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//获得要删除的商品id
		String pid=request.getParameter("pid");
		
		//得到购物车
		Map<String,CartItem> cartMap=(Map<String,CartItem>) request.getSession().getAttribute("cartMap");
	
		System.out.println(cartMap.size());
		 System.out.println("pid--"+pid);
		
		 //从购物车里删除购物项
	     cartMap.remove(pid);
		 
	     
	     //将购物车重新放回session 
	     request.getSession().setAttribute("cartMap", cartMap);
	     
	     //重定向到showCart
	     response.sendRedirect("showCart");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
