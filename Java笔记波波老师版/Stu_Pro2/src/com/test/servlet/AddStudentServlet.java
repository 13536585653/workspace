package com.test.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.test.bean.Student;
import com.test.dao.StudentDao;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private StudentDao dao=new StudentDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//得到表单提交的数据
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String sex=request.getParameter("sex");
		String[] funs=request.getParameterValues("fun");
		String fun="";
		
		if(funs!=null){
			fun=Arrays.toString(funs);
		}
		
		//将数据封装成一个对象
		Student stu=new Student();
		stu.setS_name(name);
		stu.setS_age(Integer.parseInt(age));
		stu.setS_sex(sex);
		stu.setS_fun(fun);
		
		//测试输出
		System.out.println(stu);
		
		
		//调用dao的添加学员方法
		dao.addStudent(stu);
		
		//重定向到listServlet
		response.sendRedirect("list");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
