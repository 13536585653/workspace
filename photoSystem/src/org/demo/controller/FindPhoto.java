package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.PhotoDao;
import org.demo.entity.PhotoBean;

@SuppressWarnings("serial")
@WebServlet("/findPhoto")
public class FindPhoto extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		PhotoDao pd=new PhotoDao();
		List<PhotoBean> list=pd.findPhoto();
		request.getSession().setAttribute("Plist", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
