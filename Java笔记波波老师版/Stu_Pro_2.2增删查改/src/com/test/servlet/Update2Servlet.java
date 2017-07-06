package com.test.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.misc.Perf.GetPerfAction;

import com.test.bean.City;
import com.test.bean.Student;
import com.test.dao.StudentDao;

/**
 * Servlet implementation class Update2Servlet
 */
public class Update2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private StudentDao  dao=new StudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
		 
		       //得到表单提交的数据
		        int id=Integer.parseInt(request.getParameter("id"));
				String name=request.getParameter("name");
				String age=request.getParameter("age");
				String sex=request.getParameter("sex");
				String[] funs=request.getParameterValues("fun");
				int c_id=Integer.parseInt(request.getParameter("c_id"));
				String fun="";
				
				if(funs!=null){
					String s=Arrays.toString(funs);
					fun=s.substring(1,s.length()-1);
				}
				
				//将数据封装成一个对象
				Student stu=new Student();
				stu.setS_id(id);
				stu.setS_name(name);
				stu.setS_age(Integer.parseInt(age));
				stu.setS_sex(sex);
				stu.setS_fun(fun);
				City city=new City();
				city.setC_id(c_id);
				stu.setCity(city);
		
                //调用dao.updateStudent(stu)修改数据
				dao.updateStudent(stu);
				
				//重定向list
                response.sendRedirect("list");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
