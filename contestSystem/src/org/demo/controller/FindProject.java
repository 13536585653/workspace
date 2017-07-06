package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.ProjectDao;
import org.demo.entity.ProjectBean;

@WebServlet("/findProject")
public class FindProject extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProjectDao pd=new ProjectDao();
		List<ProjectBean> list=pd.findProject();
		for (ProjectBean pb : list) {
			System.out.println(pb.getProjectname());
		}
		request.getSession().setAttribute("plist", list);
		request.getRequestDispatcher("addMyScore.jsp").forward(request, response);
	}
	
}
