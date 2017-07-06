package org.demo.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.MyScoreDao;
import org.demo.entity.MyScoreBean;
import org.demo.entity.ProjectBean;

@WebServlet("/addMyScore")
public class AddMyScore extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int projectname=Integer.parseInt(request.getParameter("projectname"));
		String document=request.getParameter("document");
		String code=request.getParameter("code");
		String ui=request.getParameter("ui");
		String speech=request.getParameter("speech");
		
		ProjectBean pb=new ProjectBean();
		pb.setProjectid(projectname);
		MyScoreBean msb=new MyScoreBean();
		msb.setProject(pb);
		msb.setUi(Float.parseFloat(ui));
		msb.setCode(Float.parseFloat(code));
		msb.setDocument(Float.parseFloat(document));
		msb.setSpeech(Float.parseFloat(speech));
		msb.setSdate(new Timestamp(System.currentTimeMillis()));
		MyScoreDao msd=new MyScoreDao();
		int i=msd.addMyScore(msb);
		String Mmsg=i==0?"添加失败":"添加成功";
		System.out.println(Mmsg);
		request.setAttribute("Mmsg", Mmsg);
		request.getRequestDispatcher("findMyScore").forward(request, response);
	}
}
