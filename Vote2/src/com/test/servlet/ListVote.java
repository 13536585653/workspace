package com.test.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Vote;
import com.test.dao.VoteDao;

/**
 * Servlet implementation class ListVote
 */
public class ListVote extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private VoteDao voteDao=new VoteDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListVote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
		   //查出全部的投票主题
		  List<Vote> list =voteDao.getList();
		  request.getServletContext().setAttribute("list", list);
		  response.sendRedirect("listVote.jsp");
 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
