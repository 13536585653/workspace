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
	 * 添加用户的方法
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
	 * 查询全部用户的方法
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
	 * 批量删除用户的方法
	 * @param user
	 * @return
	 */
	public int[] RemoveUser(int[] uids){
		String sql = "delete from users where u_id = ?";
		Connection conn = null;	
		PreparedStatement ps = null;
		int[] rows = null;
		try{
			//通过连接对象，我们将conn的自动事务提交改为手动事务提交
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);//Commit提交
			ps = conn.prepareStatement(sql);
			for (int uid : uids) {
				//设置不同的参数
				ps.setInt(1, uid);
				//添加到批量操作的缓存中
				ps.addBatch();
			}
			//执行批量操作
			rows = ps.executeBatch();//Batch 批量
			//手动来提交事务
			conn.commit();
		}catch(SQLException e){
			e.printStackTrace();
			//在这里进行事务的回滚操作
			try {
				conn.rollback();//rollback 回滚
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
	 * 查某个用户的方法
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
			
			//执行
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
