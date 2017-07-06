package org.demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.PhotoDao;
import org.demo.entity.PhotoBean;
import org.demo.util.BeanUtil;

@WebServlet("/addPhoto")
public class AddPhoto extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name=request.getParameter("name");
//		int count=Integer.parseInt(request.getParameter("count"));
//		String type=request.getParameter("type");
//		String emial=request.getParameter("emial");
//		String tel=request.getParameter("tel");
		
		PhotoBean pb=BeanUtil.toBean(request.getParameterMap(), PhotoBean.class);
		PhotoDao pd=new PhotoDao();
		int i=pd.addPhoto(pb);
		String msg=i==0?"添加失败":"添加成功";
		request.setAttribute("msg", msg);
		System.out.println(msg);
		request.getRequestDispatcher("findPhoto").forward(request, response);
	}
	
}
