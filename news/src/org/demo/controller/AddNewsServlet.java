package org.demo.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.NewsDao;
import org.demo.entity.NewsBean;

@WebServlet("/addNewsServlet")
@SuppressWarnings("serial")
public class AddNewsServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String ntitle=request.getParameter("ntitle");
		String ntype=request.getParameter("ntype");
		String[] nareas=request.getParameterValues("narea");
		String narea="";
		if(narea!=null){
			String s=Arrays.toString(nareas);
			narea=s.substring(1, s.length()-1);
		}
		String nauthor=request.getParameter("nauthor");
		Date ntime=Date.valueOf(request.getParameter("ntime"));
		String ncontent=request.getParameter("ncontent");
		
		NewsBean nb=new NewsBean();
		nb.setNtitle(ntitle);
		nb.setNtype(ntype);
		nb.setNarea(narea);
		nb.setNauthor(nauthor);
		nb.setNtime(ntime);
		nb.setNcontent(ncontent);
		NewsDao dao=new NewsDao();
		int i=dao.addNews(nb);
		String msg=i==0?"添加失败":"添加成功";
		System.out.println(msg);
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("newsListServlet").forward(request, response);
	}
}
