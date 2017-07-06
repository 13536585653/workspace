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
		
		//ȡ����Ʒ�б�
		List<Product> productList=(List<Product>) request.getServletContext().getAttribute("productList");
 		
		
		//ѭ�������ҳ��
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//��session��ȡ���û���
		String name=(String) request.getSession().getAttribute("name");
		
		if(name!=null && name.length()!=0){
			
			out.print("<h4>��ӭ"+name+"�����̳�</h4>");
		}
		
		out.print("<a href='cart/showCart'>�鿴���ﳵ</a>");
		out.print("<form action='cart/addCart' method='post'>");
		out.print("<table border=1 width='800px'>");
		out.print("<tr>");
		out.print("<td>���</td>");
		out.print("<td>����</td>");
		out.print("<td>����</td>");
		out.print("<td>�۸�</td>");
		out.print("<td>��ѡ��</td>");
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
		out.print("<input type='submit' value='����'>");
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
