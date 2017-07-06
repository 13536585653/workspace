package org.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.users.entity.UserBean;
import org.users.utils.DBUtil;

public class UserDao {
	/**
	 * ����û��ķ���
	 * @param user
	 * @return
	 */
	public int addUser(UserBean user){
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into users values(?,?,?,?)";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.getU_name());
			ps.setString(2, user.getU_password());
			ps.setInt(3, user.getU_age());
			ps.setString(4, user.getU_address());
			i = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		
		return i;
	}
	
	/**
	 * ��ѯȫ���û��ķ���
	 * @return
	 */
	public List<UserBean> findAllUser(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<UserBean> list =new ArrayList<UserBean>();
		String sql="select * from users";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				UserBean user=new UserBean();
					user.setU_id(rs.getInt(1));
					user.setU_name(rs.getString(2));
					user.setU_age(rs.getInt(4));
					user.setU_address(rs.getString(5));
					list.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		
		return list;
	}
	
	/**
	 * ����ɾ���û��ķ���
	 * @param user
	 * @return
	 */
	public int[] RemoveUser(int[] uids){
		String sql = "delete from users where u_id = ?";
		Connection conn = null;	
		PreparedStatement ps = null;
		int[] rows = null;
		try{
			//ͨ�����Ӷ������ǽ�conn���Զ������ύ��Ϊ�ֶ������ύ
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);//Commit�ύ
			ps = conn.prepareStatement(sql);
			for (int uid : uids) {
				//���ò�ͬ�Ĳ���
				ps.setInt(1, uid);
				//��ӵ����������Ļ�����
				ps.addBatch();
			}
			//ִ����������
			rows = ps.executeBatch();//Batch ����
			//�ֶ����ύ����
			conn.commit();
		}catch(SQLException e){
			e.printStackTrace();
			//�������������Ļع�����
			try {
				conn.rollback();//rollback �ع�
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return rows;
	}
	
	/**
	 * ��ĳ���û��ķ���
	 * @param user
	 * @return
	 */
	public UserBean findUserByName(UserBean user){
		String sql="select * from users where u_name=?";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try{
			conn =DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.getU_name());
			
			//ִ��
			rs=ps.executeQuery();
			if(rs.next()){
				UserBean newUser=new UserBean();
				newUser.setU_id(rs.getInt(1));
				newUser.setU_name(rs.getString(2));
				newUser.setU_password(rs.getString(3));
				newUser.setU_age(rs.getInt(4));
				newUser.setU_address(rs.getString(5));
				return newUser;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return null;
	}
}
