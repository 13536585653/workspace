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
		//设置请求数据的编码
		request.setCharacterEncoding("utf-8");
		//设置内容类型
		response.setContentType("text/html;charset=utf-8");
		//接收请求的数据
		String username=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		if("z".equals(username) && "1".equals(pwd)){
			System.out.println("登录成功！\n"+"姓名："+username+"\n密码："+pwd);
				//转发到success.html
		//request.getRequestDispatcher("WEB-INF/success.html").forward(request, response);
				//转发到successServlet
			
		request.getRequestDispatcher("WEB-INF/success.html").forward(request, response);
		}else{
			//重定向到失败页面
			System.out.println("登录失败！");
			//重定向到error.html
			response.sendRedirect("error.html");
			//response.sendRendirect("a");
		}
	}
       
}
