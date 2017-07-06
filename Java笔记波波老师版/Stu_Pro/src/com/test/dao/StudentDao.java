package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.test.bean.Student;
import com.test.util.DBUtil;

public class StudentDao {
	
	/*
	 * ������ݵ�����ɾ���飬��
	 * 
	 */
	
	
	//���ѧԱ�����ݿ�
	public  int addStudent(Student stu){
		
		//�õ�����
		Connection conn=DBUtil.getConnection();
		PreparedStatement pstm=null;
		int n=0;
		//����������ݵ�sql���
		String sql="insert into student(s_name,s_age,s_sex,s_fun) " +
				" values(?,?,?,?)";
		
		try {
			
			//����pstm
			pstm=conn.prepareStatement(sql);
		  
			//Ϊ?���ò���
		    pstm.setString(1, stu.getS_name());
		    pstm.setInt(2, stu.getS_age());
		    pstm.setString(3, stu.getS_sex());
		    pstm.setString(4, stu.getS_fun());
		
		    //ִ�в�ѯ
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
