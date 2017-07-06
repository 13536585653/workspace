package com.test.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VoteServlet
 */
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   //得到表单的投票结果
		String[]  balls=request.getParameterValues("ball");
		
		if(balls ==null || balls.length==0){
			response.sendRedirect("vote.html");
			return ;
		}
		//取出原来的存结果的map
		Map<String,Integer> map=(Map<String, Integer>) request.getServletContext().getAttribute("resultMap");
		
		
		//比较，票数++
		for (String ball : balls) {
			
			//获得原来的票数+1，再放回map
			if(map.containsKey(ball)){
				/*int n=map.get(ball);
				n++;
				map.put(ball, n);*/
			   map.put(ball, map.get(ball)+1);	
			}
		}
		
		//把map 再存入ctx
		request.getServletContext().setAttribute("resultMap", map);
		
		//重定向到result.jsp
		response.sendRedirect("result.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
