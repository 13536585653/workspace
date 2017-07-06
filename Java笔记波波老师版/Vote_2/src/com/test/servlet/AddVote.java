package com.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Vote;
import com.test.dao.VoteDao;

/**
 * Servlet implementation class AddVote
 */
public class AddVote extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private VoteDao voteDao=new VoteDao();   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String v_title=request.getParameter("v_title");
		 String v_desp=request.getParameter("v_desp");
		 String v_type=request.getParameter("v_type");
		 
		 if(v_title==null || v_title.length()==0){
			 
			 response.sendRedirect("addVote.html");
			 return ;
		 }
		
		 Vote vote=new Vote();
		 vote.setV_title(v_title);
		 vote.setV_desp(v_desp);
		 vote.setV_type(v_type);
		 
		 voteDao.add(vote);
		 
		 request.getServletContext().setAttribute("msg", "<h2>Ìí¼Ó³É¹¦£¡</h2>");
		 response.sendRedirect("success.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
