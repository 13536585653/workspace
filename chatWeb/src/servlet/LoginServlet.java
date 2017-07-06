package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//得到用户名和密码
		String name=request.getParameter("username");
		//存入session
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
		
		//从ctx里取出用户列表
		List<String> userList=(List<String>) request.getServletContext().getAttribute("userList");
		
		if(userList==null){
			userList=new ArrayList<String>();
		}
		
		//将用户加入用户列表
		userList.add(name);
		//将用户列表存入ctx 
		request.getServletContext().setAttribute("userList", userList);
		
		//重定向
		response.sendRedirect("main/chat.html");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
