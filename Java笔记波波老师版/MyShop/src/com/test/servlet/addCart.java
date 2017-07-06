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
		
		//����û��ύ����Ʒid
		String[] ids=request.getParameterValues("proId");
		
		if(ids==null && ids.length==0){
			response.sendRedirect("../index");
		}else{
			
			//�õ�ȫ����Ʒ�б�,��ѡ����id��ȫ����Ʒ�б��id�Ƚϣ�
			//����û��������Ʒ������session��
			List<Product> productList=(List<Product>) request.getServletContext().getAttribute("productList");
			
			//���ﳵ�б�
			Map<String,CartItem> cartMap=(Map<String,CartItem>) request.getSession().getAttribute("cartMap");
			if(cartMap==null)
			   cartMap=new HashMap<String,CartItem>();
			
			for (String id  : ids) {
				
				for (Product p : productList) {
					
					if(id.equals(p.getProId())){
						
						CartItem cartItem;	
						
						//������ﳵ�д���Ʒ���
						if(cartMap.containsKey(id)){
							//ȡ��ԭ������Ʒ��
							cartItem=cartMap.get(id);
							cartItem.setNum(cartItem.getNum()+1);
							
						}else{
							//���û�о�newһ��
						   cartItem=new CartItem(p, 1);
						 
						}
						cartItem.setSum();//�����ܼ�
						cartMap.put(p.getProId(), cartItem);
					}
				}
			}
			
			//�ѹ��ﳵ�б����session
		  request.getSession().setAttribute("cartMap", cartMap);
		  response.sendRedirect("showCart");
		}
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
