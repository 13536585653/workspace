package com.test.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.CartItem;
import com.test.bean.Product;

/**
 * Servlet implementation class addCart
 */
public class addCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//获得用户提交的商品id
		String[] ids=request.getParameterValues("proId");
		
		if(ids==null && ids.length==0){
			response.sendRedirect("../index");
		}else{
			
			//得到全部商品列表,将选购的id和全部商品列表的id比较，
			//获得用户购买的商品。存入session中
			List<Product> productList=(List<Product>) request.getServletContext().getAttribute("productList");
			
			//购物车列表
			Map<String,CartItem> cartMap=(Map<String,CartItem>) request.getSession().getAttribute("cartMap");
			if(cartMap==null)
			   cartMap=new HashMap<String,CartItem>();
			
			for (String id  : ids) {
				
				for (Product p : productList) {
					
					if(id.equals(p.getProId())){
						
						CartItem cartItem;	
						
						//如果购物车有此商品编号
						if(cartMap.containsKey(id)){
							//取出原来的商品项
							cartItem=cartMap.get(id);
							cartItem.setNum(cartItem.getNum()+1);
							
						}else{
							//如果没有就new一个
						   cartItem=new CartItem(p, 1);
						 
						}
						cartItem.setSum();//计算总价
						cartMap.put(p.getProId(), cartItem);
					}
				}
			}
			
			//把购物车列表存入session
		  request.getSession().setAttribute("cartMap", cartMap);
		  response.sendRedirect("showCart");
		}
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
