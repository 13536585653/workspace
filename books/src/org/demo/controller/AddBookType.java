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
				//���������ݷ�װ��bean��
				BookType_Bean type = new BookType_Bean();
				type.setBt_type(request.getParameter("btName"));
				//����dao��bean���浽���ݿ�
				CheckTypeService service = new CheckTypeService();
				int row = service.checkTs(type);
				String msg = row == 0 ? "����鼮����ʧ��" : "����鼮���ͳɹ�";
				//����Ϣ����������������
				request.getSession().setAttribute("msg", msg);
				//ת��
				System.out.println(type);
				System.out.println(msg);
				request.getRequestDispatcher("addBookType.jsp").forward(request, response);
			}
	}

