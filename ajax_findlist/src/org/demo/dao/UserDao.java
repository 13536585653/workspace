package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.UserBean;
import org.demo.util.DBUtil;

public class UserDao {
	//查找全部用户
	public List<UserBean> findAllUser(){
		Connection conn=null;
		PreparedStatement ps=null;
		List<UserBean> list =new ArrayList<UserBean>();
		ResultSet rs=null;
		String sql="select * from myuser";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				UserBean ub=new UserBean();
				ub.setId(rs.getInt(1));
				ub.setName(rs.getString(2));
				ub.setAge(rs.getInt(4));
				ub.setAddress(rs.getString(5));
				list.add(ub);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
			return list;
	} 
}
