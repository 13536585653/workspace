package servlet;

import java.io.IOException;
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
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		
		if("admin".equals(name)&&"123".equals(pwd)){
			System.out.println(name+"�û���֤�ɹ���");
			System.out.println(name+"������Ϊ"+pwd);
			
			//���ûỰ������
			HttpSession session=request.getSession();
			session.setAttribute("name",name);
			
			//ת��
			request.getRequestDispatcher("main/mainServlet").forward(request, response);
			
		}else{
			System.out.println(name+"�û���֤ʧ�ܣ�");
			System.out.println(name+"����Ϊ"+pwd);
			//�ض���
			response.sendRedirect("error.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
