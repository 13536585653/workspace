package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.ClassBean;
import org.demo.util.DBUtil;

public class ClassDao {
	int i=0;
	/**
	 * 添加班级的方法
	 * @param cb
	 * @return
	 */
	public int  addClass(ClassBean cb){
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="insert into class values(?)";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, cb.getCname());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return i;
	}
	
	/**
	 * 查询单个班级的方法
	 */
	public ClassBean findClass(ClassBean cb){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String sql="select * from class where cname=?";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, cb.getCname());
			rs=ps.executeQuery();
			if(rs.next()){
				ClassBean newcb=new ClassBean();
				newcb.setCname(rs.getString(1));
				return newcb;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return null;
	}
	
	/**
	 * 查询全部班级的方法
	 */
	public List<ClassBean> findAllClass(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String sql="select * from class";
		List<ClassBean> list=new ArrayList<ClassBean>();
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()){
				ClassBean newcb=new ClassBean();
				newcb.setCid(rs.getInt(1));
				newcb.setCname(rs.getString(2));
				list.add(newcb);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return list;
	}
}
