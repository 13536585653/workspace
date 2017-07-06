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
		
		//�õ��µ��ύ������
		String msg=request.getParameter("msg");
		
		//�õ���ʷ�����¼
		String s=(String) request.getServletContext().getAttribute("s");
		
		if(s==null){
			s="";
		}
		
		//�õ��û���
		String name=(String) request.getSession().getAttribute("name");
		//����ʷ�����¼+����������
		s=s+"<br>"+name+"˵:"+msg;
	    
		//���������ݴ���ctx 
		request.getServletContext().setAttribute("s", s);
		
		//�ض���chat.html
        response.sendRedirect("chat.html");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
