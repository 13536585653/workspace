package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.util.DBUtil;

public class AdminDao {

	//通过用户名，查该用户的真密码
	public String getPwdByName(String admin_name) {
		Connection conn=DBUtil.getConnection();
		String sql=" select admin_pwd from admins " +
				   "  where admin_name=?";
		PreparedStatement pstm=null;
		
		String pwd="";
		try {
			pstm=conn.prepareStatement(sql);
		    pstm.setString(1,admin_name);
		    
		    ResultSet  rs=pstm.executeQuery();
		    
		    while(rs.next()){
		    	pwd=rs.getString("admin_pwd");
		    }
			
		
		} catch (SQLException e) {
		     e.printStackTrace();
		}finally{
			
			DBUtil.closeConn(conn, pstm);
		}
		
		
		return pwd;
	}

}
