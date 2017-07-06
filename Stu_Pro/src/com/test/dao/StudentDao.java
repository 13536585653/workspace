 package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.bean.Student;
import com.test.util.DBUtil;

public class StudentDao {
	
	/*
	 * 完成数据的增，删，查，改
	 * 
	 */
	
	
	//添加学员到数据库
	public  int addStudent(Student stu){
		
		//得到连接
		Connection conn=DBUtil.getConnection();
		PreparedStatement pstm=null;
		int n=0;
		//创建添加数据的sql语句
		String sql="insert into student(s_name,s_age,s_sex,s_fun) " +
				" values(?,?,?,?)";
		
		try {
			
			//创建pstm
			pstm=conn.prepareStatement(sql);
		  
			//为?设置参数
		    pstm.setString(1, stu.getS_name());
		    pstm.setInt(2, stu.getS_age());
		    pstm.setString(3, stu.getS_sex());
		    pstm.setString(4, stu.getS_fun());
		
		    //执行查询
		    n=pstm.executeUpdate();
		    
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, pstm);
		}
		return n;
	}

	
	//获得全部学员
	public List<Student> getList(){
		
		List<Student> list=new ArrayList<Student>();
		//得到连接
		Connection conn=DBUtil.getConnection();
		//编写查询的sql语句
		String sql="select * from student";
		
		//创建pstm
		PreparedStatement  pstm=null;
		
		try {
			pstm=conn.prepareStatement(sql);
		
		  //执行查询, 得到结果集
			ResultSet rs=pstm.executeQuery();
		  
		//循环结果集，将结果集中的数据封装成student,装入list
			while(rs.next()){
				int id=rs.getInt("s_id");
				String name=rs.getString("s_name");
				int age=rs.getInt("s_age");
				String sex=rs.getString("s_sex");
				String fun=rs.getString("s_fun");
				
				Student stu=new Student(id, name, age, sex, fun);
				
				list.add(stu);
			}
			
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}finally{
			
			DBUtil.closeConn(conn, pstm);
		}
		
		
		
		return list;
	}
	
	
	
}
