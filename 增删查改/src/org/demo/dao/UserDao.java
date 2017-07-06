package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.bean.UserBean;
import org.demo.utils.DBUtil;
import org.junit.Test;


public class UserDao {
	//�������
	Connection conn=null;
	//Ԥ�������
	PreparedStatement ps=null;
	//����һ������
	int i=0;
	
	/**
	 * ����û��ķ���
	 * @param user
	 * @return
	 */
	
	public int addUser(UserBean user){
		String sql="insert into users values(?,?,?)";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.getU_name());
			ps.setInt(2, user.getU_age());
			ps.setString(3, user.getU_address());
			
			//ִ��
			i=ps.executeUpdate();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, ps);
		}
		
		return i;
	}
	
	/**
	 * ɾ���û��ķ���
	 * @param user
	 * @return
	 */
	
	public int RemoveUser(UserBean user){
		String sql="delete users  where u_id=?";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, user.getU_id());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, ps);
		}
		
		return i;
	}
	
	/**
	 * ����ɾ����Ϣ �ķ���
	 * @param mid
	 * @return
	 */
	public int[] removeMassage(int[] mid){
		Connection conn=null;
		PreparedStatement ps=null;
		int[] rows=null;
		
		String sql="delete from MessageInfo where mid=?";
		try{
			conn=DBUtil.getConnection();
			//ͨ�����Ӷ������ǽ�conn���Զ������ύ��Ϊ�ֶ������ύ
			conn.setAutoCommit(false);
			ps=conn.prepareStatement(sql);
			for (int i : mid) {
				//���ò�ͬ�Ĳ���
				ps.setInt(1, i);
				//��ӵ����������Ļ�����
				ps.addBatch();
			}
			//ִ����������
			rows=ps.executeBatch();
			//�ֶ��ύ����
			conn.commit();
		}catch(SQLException e){
			e.printStackTrace();
			//�������������ع�
			try{
				conn.rollback();
			}catch(SQLException e1){
				e.printStackTrace();
			}
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return rows;
	}
	
	//��������ɾ��
	@Test
	public void testRemoveMessage(){
		int[] mid=new int[2];
		mid[1]=234;
		mid[0]=234;
		UserDao md=new UserDao();
		int[] rows=md.removeMassage(mid);
		String msg=rows==null?"ɾ��ʧ��":"ɾ���ɹ�";
		System.out.println(msg);
	}
	/**
	 * �޸��û��ķ���
	 * @param user
	 * @return
	 */
	
	public int updateUser(UserBean user){
		String sql="update users set u_name=?,u_age=?,u_address=? where u_id=?";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.getU_name());
			ps.setInt(2, user.getU_age());
			ps.setString(3, user.getU_address());
			ps.setInt(4, user.getU_id());
			//ִ��
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, ps);
		}
		return i;
	}
	
	/**
	 * ��ѯĳ���û��ķ���
	 * @param user
	 * @return
	 */
	public UserBean findUserById(UserBean user){
		ResultSet rs=null;
		String sql="select * from users where u_id=?";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, user.getU_id());
			
			rs=ps.executeQuery();
			if(rs.next()){
				UserBean newuser=new UserBean();
				newuser.setU_name(rs.getString(2));
				newuser.setU_age(rs.getInt(3));
				newuser.setU_address(rs.getString(4));
				return newuser;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn,ps);
		}
		
		return null;
	}
	
	/**
	 * ��ѯȫ���û�����Ϣ
	 * @return
	 */
	public List<UserBean> findAllUser(){
		ResultSet rs=null;
		//��ѯȫ���û�
		String sql="select * from users";
		//��һ������������user��Ϣ
		List<UserBean> list=new ArrayList<UserBean>();
		try{
			conn=DBUtil.getConnection();
			//��ȡ��sql�ģ�Ԥ������䱣����ps
			ps=conn.prepareStatement(sql);
			//ִ��
			rs=ps.executeQuery();
			
			while(rs.next()){
				UserBean user=new UserBean();
				user.setU_id(rs.getInt(1));
				user.setU_name(rs.getString(2));
				user.setU_age(rs.getInt(3));
				user.setU_address(rs.getString(4));
				list.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn,ps);
		}
		
		return list;
	}
}
