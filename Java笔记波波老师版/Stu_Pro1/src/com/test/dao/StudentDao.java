package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
