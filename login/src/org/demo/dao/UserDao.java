package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.demo.entity.User;
import org.demo.utils.DBUtil;

public class UserDao {
	/**
	 * �����û������û���Ϣ
	 * 
	 */
	public User findUser(User user){
		PreparedStatement pstm=null;
		Connection conn=null;
		ResultSet rs=null;
		User newUser=new User();
		
		//��дsql���
		String sql="select * from userlogin where userName=?";
		try {
			conn=DBUtil.getConnection();
			pstm = conn.prepareStatement(sql);
			//Ϊ������ֵ
			pstm.setString(1, user.getUserName());
			rs=pstm.executeQuery();
			
			//�жϽ����
			if(rs.next()){
				newUser.setPassword(rs.getString(3));
				return newUser;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, pstm, conn);
		}
		return null;
	}
}
