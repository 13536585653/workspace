package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//�����������ݵı���
		request.setCharacterEncoding("utf-8");
		//������������
		response.setContentType("text/html;charset=utf-8");
		//�������������
		String username=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		if("z".equals(username) && "1".equals(pwd)){
			System.out.println("��¼�ɹ���\n"+"������"+username+"\n���룺"+pwd);
				//ת����success.html
		//request.getRequestDispatcher("WEB-INF/success.html").forward(request, response);
				//ת����successServlet
			
		request.getRequestDispatcher("WEB-INF/success.html").forward(request, response);
		}else{
			//�ض���ʧ��ҳ��
			System.out.println("��¼ʧ�ܣ�");
			//�ض���error.html
			response.sendRedirect("error.html");
			//response.sendRendirect("a");
		}
	}
       
}
