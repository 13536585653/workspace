package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import org.demo.entity.UserBean;
import org.demo.utils.DBUtil;
import org.junit.Test;

public class UserDao extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 添加用户的 方法
	 * @param user
	 * @return
	 */
	public int addUser(UserBean user){
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		
		String sql="insert into  stu_info values(?,?,?)";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.getU_name());
			ps.setString(2, user.getU_pwd());
			ps.setString(3, user.getU_sex());
			
			i=ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, ps);
		}
		
		return i;
	}
	/**
	 * 查询全部用户的方法
	 * @param users
	 * @return
	 */
	public List<UserBean> findAllUser(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from stu_info";
		List<UserBean> list=new ArrayList<UserBean>();
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()){
				UserBean user=new UserBean();
				user.setU_id(rs.getInt(1));
				user.setU_name(rs.getString(2));
				user.setU_pwd(rs.getString(3));
				user.setU_sex(rs.getString(4));
				list.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, ps);
		}
		return list;
	}
	
	/**
	 * 测试查询全部用户的方法
	 */
	@Test
	public void testFindUser(){
		UserDao dao=new UserDao();
		List<UserBean> list=dao.findAllUser();
		if(list.size()!=0){
		for (UserBean user : list) {
			System.out.print(user.getU_id());
			System.out.print(user.getU_name());
			System.out.println(user.getU_pwd());
			System.out.print(user.getU_sex());
			System.out.println();
		}
			}else{
			System.out.println("没有找到用户");
		
			}
	}
	
}
