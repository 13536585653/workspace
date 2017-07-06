package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CharServlet
 */
public class CharServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//得到新的提交的内容
		String msg=request.getParameter("msg");
		
		//得到历史聊天记录
		String s=(String) request.getServletContext().getAttribute("s");
		
		if(s==null){
			s="";
		}
		
		//得到用户名
		String name=(String) request.getSession().getAttribute("name");
		//将历史聊天记录+新聊天内容
		s=s+"<br>"+name+"说:"+msg;
	    
		//将聊天内容存入ctx 
		request.getServletContext().setAttribute("s", s);
		
		//重定向chat.html
        response.sendRedirect("chat.html");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
