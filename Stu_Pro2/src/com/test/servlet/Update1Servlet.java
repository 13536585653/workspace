package com.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Student;
import com.test.dao.StudentDao;

/**
 * Servlet implementation class Update1Servlet
 */
public class Update1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private StudentDao dao=new StudentDao();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//获得要修改的学员id
		int id=Integer.parseInt(request.getParameter("s_id"));
		
		//通过dao，查询获得单个学员
		Student stu=dao.getStudentById(id);
		
		request.getServletContext().setAttribute("stu", stu);
		
		//重定向到updateStudent.jsp
		response.sendRedirect("updateStudent.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}

}
