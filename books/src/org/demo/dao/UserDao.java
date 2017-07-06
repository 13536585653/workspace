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
	//����û��� ����
	int i=0;
	public int addUser(UserBean user){
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="insert into Users values(?,?)";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.getU_name());
			ps.setString(2, user.getU_password());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
			return i;
	}
	
	//��ѯȫ���û��ķ���
	public List<UserBean> findAllUser(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<UserBean> list=new ArrayList<UserBean>();
		String sql="select * from Users";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()){
				UserBean user=new UserBean();
				user.setU_id(rs.getInt(1));
				user.setU_name(rs.getString(2));
				user.setU_password(rs.getString(3));
				list.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return list;
	}
	
	//��ѯ�����û��ķ���
	public UserBean findUser(UserBean user){
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			String sql="select * from Users where u_name=?";
			
			try{
				conn=DBUtil.getConnection();
				ps=conn.prepareStatement(sql);
				ps.setString(1, user.getU_name());
				rs=ps.executeQuery();
				
				if(rs.next()){
					UserBean newUser= new UserBean();
					newUser.setU_name(rs.getString(1));
					newUser.setU_password(rs.getString(2));
					return newUser;
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				DBUtil.close(null, ps, conn);
			}
		return null;
	}
}
