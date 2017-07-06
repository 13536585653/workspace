package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.BDao;
import org.demo.entity.BookType_Bean;
import org.demo.entity.Books_Bean;

@WebServlet("/addBooks")
public class AddBooks extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException{
		String bname=request.getParameter("bname");
		String ctime=request.getParameter("ctime");
		Books_Bean book=new Books_Bean();
		book.setB_name(bname);
		book.setB_date(ctime);
		BookType_Bean type=new BookType_Bean();
		String btid=request.getParameter("type");
		type.setBt_id(Integer.parseInt(btid));
		//将type对象封装到book里面
		book.setType(type);
		
		BDao dao=new BDao();
		int i=dao.addBook(book);
		String msg2=i==0?"添加失败":"添加成功";
		System.out.println(msg2);
		if(bname==null||ctime==null){
			response.sendRedirect("addBooks.jsp");
			System.out.println("添加失败！");
			return;
		}
		request.setAttribute("msg2", msg2);
		request.getRequestDispatcher("findBooksServlet").forward(request, response);
	}
}
