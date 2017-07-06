package org.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.ProjectDao;
import org.demo.entity.ProjectBean;
import org.demo.util.BeanUtil;

@WebServlet("/addProject")
public class AddProject extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String projectName=request.getParameter("projectName");
		String remark=request.getParameter("remark");*/
		ProjectBean pb=BeanUtil.toBean(request.getParameterMap(), ProjectBean.class);
		ProjectDao pd=new ProjectDao();
		int i=pd.addProject(pb);
		String Pmsg=i==0?"添加失败":"添加成功";
		System.out.println(Pmsg);
		request.setAttribute("Pmsg", Pmsg);
		request.getRequestDispatcher("findProject").forward(request, response);
	}
	
}
