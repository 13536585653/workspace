package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.demo.entity.User;
import org.demo.utils.DBUtil;

public class UserDao {
	/**
	 * 查找用户具体用户信息
	 * 
	 */
	public User findUser(User user){
		PreparedStatement pstm=null;
		Connection conn=null;
		ResultSet rs=null;
		User newUser=new User();
		
		//编写sql语句
		String sql="select * from userlogin where userName=?";
		try {
			conn=DBUtil.getConnection();
			pstm = conn.prepareStatement(sql);
			//为？设置值
			pstm.setString(1, user.getUserName());
			rs=pstm.executeQuery();
			
			//判断结果集
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
