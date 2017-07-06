package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.bean.City;
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
		String sql="insert into student(s_name,s_age,s_sex,s_fun,s_city) " +
				" values(?,?,?,?,?)";
		
		try {
			
			//创建pstm
			pstm=conn.prepareStatement(sql);
		  
			//为?设置参数
		    pstm.setString(1, stu.getS_name());
		    pstm.setInt(2, stu.getS_age());
		    pstm.setString(3, stu.getS_sex());
		    pstm.setString(4, stu.getS_fun());
		    pstm.setInt(5, stu.getCity().getC_id());
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

	
	//获得全部学员list
	public List<Student> getList(){
		
		List<Student> list=new ArrayList<Student>();
		//得到连接
		Connection conn=DBUtil.getConnection();
		//编写查询的sql语句
		String sql="select * from student join city " +
				"on student.s_city=city.c_id ";
		
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
				int c_id=rs.getInt("s_city");
				String c_name=rs.getString("c_name");
				City city=new City(c_id,c_name);
				Student stu=new Student(id, name, age, sex, fun,city);
				
				list.add(stu);
			}
			
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}finally{
			
			DBUtil.closeConn(conn, pstm);
		}
		
		
		
		return list;
	}

    //根据学员id,删除学员
	public void deleteById(int s_id) {
	 
		//获得链接
		Connection conn=DBUtil.getConnection();
		//编写删除的sql语句
		String sql="delete from student where s_id=?";
		
		PreparedStatement pstm=null;
		
		try {
			//创建pstm
			pstm=conn.prepareStatement(sql);
			//为？赋值
			pstm.setInt(1, s_id);
			//执行删除
			pstm.executeUpdate();
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, pstm);
		}
		
		
	}


	//根据学员id,查单个学员
	public Student getStudentById(int s_id) {
		      
		 Student stu=null;
		
		//得到连接
		Connection conn=DBUtil.getConnection();
		//编写查询的sql语句
		String sql="select * from student join city " +
				"on student.s_city=city.c_id " +
				"and student.s_id=?";
		//创建pstm
		PreparedStatement  pstm=null;
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, s_id);
					
			//执行查询, 得到结果集
			ResultSet rs=pstm.executeQuery();
				  
			//循环结果集，将结果集中的数据封装成student
			while(rs.next()){
				String name=rs.getString("s_name");
				int age=rs.getInt("s_age");
				String sex=rs.getString("s_sex");
				String fun=rs.getString("s_fun");
				int c_id=rs.getInt("c_id");
				String  c_name=rs.getString("c_name");
				City city=new City(c_id,c_name);
				stu=new Student(s_id, name, age, sex, fun,city);
				}
			} catch (SQLException e) {
							
			e.printStackTrace();
				
			}finally{
				DBUtil.closeConn(conn, pstm);
			}
				
			return stu;
	}

	//修改学员的信息
    public void updateStudent(Student stu) {
		
		Connection conn=DBUtil.getConnection();
		String sql="update student " +
				" set s_name=?,s_age=?,s_sex=?,s_fun=?,s_city=? " +
				" where s_id=? ";
		PreparedStatement pstm=null;
		
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, stu.getS_name());
			pstm.setInt(2, stu.getS_age());
			pstm.setString(3, stu.getS_sex());
			pstm.setString(4, stu.getS_fun());
			pstm.setInt(5, stu.getCity().getC_id());
			pstm.setInt(6, stu.getS_id());
			
			pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, pstm);
		}
		
		
	}
	
	
	
}
