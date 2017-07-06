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
		
		//��session�ȡ�����ﳵ,��ʾ��ҳ����
		Map<String,CartItem> cartMap=(Map<String,CartItem>) request.getSession().getAttribute("cartMap");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//��session��ȡ���û���
		String name=(String) request.getSession().getAttribute("name");
	
		if(cartMap==null){
		
			out.print(name+"�㻹û�й���");
		
		}else{
			out.print("<h3>"+name+"�Ĺ��ﳵ�б�����:</h3>");
			out.print("<table border=1 width='800px'>");
			out.print("<tr>");
			out.print("<td>���</td>");
			out.print("<td>����</td>");
			out.print("<td>����</td>");
			out.print("<td>�۸�</td>");
			out.print("<td>����</td>");
			out.print("<td>�ϼ�</td>");
			out.print("<td>ɾ��</td>");
			out.print("</tr>");
			
			double t=0;  //�ܽ��
			//�õ�map��ȫ����key 
			Set<String> keys=cartMap.keySet();
	         
			for (String  key : keys) {
				out.print("<tr>");
				out.print("<td>"+cartMap.get(key).getP().getProId()+"</td>");
				out.print("<td>"+cartMap.get(key).getP().getProName()+"</td>");
				out.print("<td>"+cartMap.get(key).getP().getProDesc()+"</td>");
				out.print("<td>"+cartMap.get(key).getP().getProPrice()+"</td>");
				out.print("<td>"+cartMap.get(key).getNum()+"</td>");
				out.print("<td>"+cartMap.get(key).getSum()+"</td>");
				out.print("<td><a href='delCart?pid="+cartMap.get(key).getP().getProId()+"'>ɾ��</a></td>");
				out.print("</tr>");
				t+=cartMap.get(key).getSum();   //�ۼ�
			}
			
			out.print("</table>");  
			out.print("<p>�ܽ�"+t);
		}
		
		out.print("<p><a href='../index'>��������</a>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
