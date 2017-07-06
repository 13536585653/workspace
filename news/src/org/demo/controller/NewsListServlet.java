package org.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.dao.NewsDao;
import org.demo.entity.NewsBean;

@SuppressWarnings("serial")
@WebServlet("/newsListServlet")
public class NewsListServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsDao nd=new NewsDao();
		List<NewsBean> list=nd.getNewsList();
		for (NewsBean nb : list) {
			System.out.println(nb);
		}
		request.getSession().setAttribute("nblist", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
}
