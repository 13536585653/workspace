package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.entity.BookType_Bean;
import org.demo.service.CheckTypeService;

@WebServlet("/addBookType")
public class AddBookType extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException{
				//将请求数据封装到bean中
				BookType_Bean type = new BookType_Bean();
				type.setBt_type(request.getParameter("btName"));
				//调用dao将bean保存到数据库
				CheckTypeService service = new CheckTypeService();
				int row = service.checkTs(type);
				String msg = row == 0 ? "添加书籍类型失败" : "添加书籍类型成功";
				//将消息保存在请求作用域
				request.getSession().setAttribute("msg", msg);
				//转发
				System.out.println(type);
				System.out.println(msg);
				request.getRequestDispatcher("addBookType.jsp").forward(request, response);
			}
	}

