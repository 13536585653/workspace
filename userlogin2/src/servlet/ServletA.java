package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletA
 */
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletA() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print(name+":  ÇëÑ¡ÔñÄã¹ºÂòµÄÉÌÆ·<br><br>");
		out.print("<form method='post' action='b'>");
		out.print("<input type='hidden' name='name' value='"+name+"'>");
		out.print("<input type='checkbox' name='product' value='ÀºÇò'>ÀºÇò");
		out.print("<input type='checkbox' name='product' value='×ãÇò'>×ãÇò");
		out.println("<input type='checkbox' name='product' value='ÅÅÇò'>ÅÅÇò");
		out.println("<input type='submit' value='¹ºÂò'>");
		out.println("</form>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
