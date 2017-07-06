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
		
		   //�õ�����ͶƱ���
		String[]  balls=request.getParameterValues("ball");
		
		if(balls ==null || balls.length==0){
			response.sendRedirect("vote.html");
			return ;
		}
		//ȡ��ԭ���Ĵ�����map
		Map<String,Integer> map=(Map<String, Integer>) request.getServletContext().getAttribute("resultMap");
		
		
		//�Ƚϣ�Ʊ��++
		for (String ball : balls) {
			
			//���ԭ����Ʊ��+1���ٷŻ�map
			if(map.containsKey(ball)){
				/*int n=map.get(ball);
				n++;
				map.put(ball, n);*/
			   map.put(ball, map.get(ball)+1);	
			}
		}
		
		//��map �ٴ���ctx
		request.getServletContext().setAttribute("resultMap", map);
		
		//�ض���result.jsp
		response.sendRedirect("result.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
