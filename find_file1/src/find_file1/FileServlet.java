package find_file1;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/f")
public class FileServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String file=request.getParameter("file");
		File f=new File(file);//�ļ�·��
		String []s=f.list();
		//�����鱣����session��
		request.getServletContext().setAttribute("s", s);
		//request.getSession().setAttribute("s",s);
		//ת��
		System.out.println(f);
		request.getRequestDispatcher("find.jsp").forward(request, response);
	}
}
