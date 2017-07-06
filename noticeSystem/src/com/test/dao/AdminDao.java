package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.bean.Admins;
import com.test.bean.Users;
import com.test.util.DBUtil;

/*
 * admin的数据库操作类
 * */
public class AdminDao {
	
	//通过管理员信息查询数据
	public Admins selectAdmin(Admins admin){
		
		Admins newadmin=new Admins();
		String sql="select * from admins where a_name=?";
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, admin.getA_name());
			rs=pstm.executeQuery();
			if(rs.next()){
				newadmin.setA_name(rs.getString("a_name"));
				newadmin.setA_pwd(rs.getString("a_pwd"));
				newadmin.setA_position(rs.getString("a_position"));
				
				return newadmin;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	//为数据库插入管理员数据的方法
	public void insertAdmin(Admins admin) {
		
		String sql="insert into admins(a_name,a_pwd,a_position) values(?,?,?)";
		Connection conn=null;
		PreparedStatement pstm=null;
		
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, admin.getA_name());
			pstm.setString(2, admin.getA_pwd());
			pstm.setString(3, admin.getA_position());
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn, pstm);
		}
		
	}
	
	//查询该用户是否存在

	public Users selectUser(Users users) {
		Users newuser=new Users();
		String sql="select * from users where u_name=?";
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, users.getU_name());
			rs=pstm.executeQuery();
			if(rs.next()){
				newuser.setU_name(rs.getString("u_name"));
				newuser.setU_pwd(rs.getString("u_pwd"));
				newuser.setU_position("u_position");
				
				return newuser;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, pstm);
		}
		return null;
	}

	//为普通用户插入数据的方法
	public void insertUser(Users users) {
		String sql="insert into users(u_name,u_pwd,u_position) values(?,?,?)";
		Connection conn=null;
		PreparedStatement pstm=null;
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, users.getU_name());
			pstm.setString(2, users.getU_pwd());
			pstm.setString(3, users.getU_position());
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, pstm);
		}
		
	}
}
