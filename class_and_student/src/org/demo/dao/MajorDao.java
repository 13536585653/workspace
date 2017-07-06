package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.MajorBean;
import org.demo.util.DBUtil;

public class MajorDao {
	int i=0;
	/**
	 * 添加专业的方法
	 * @param mb
	 * @return
	 */
	public int addMajor(MajorBean mb){
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="insert into major values(?,?)";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, mb.getMname());
			ps.setString(2, mb.getmIntroduce());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return i;
		}
	
	/**
	 * 查询某个专业的方法
	 */
	public MajorBean findMajor(MajorBean mb){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from major where mname=?";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, mb.getMname());
			rs=ps.executeQuery();
			if(rs.next()){
				MajorBean newmb=new MajorBean();
				newmb.setMname(rs.getString(1));
				return newmb;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return null;
	}
	
	/**
	 * 查询全部专业的方法
	 * 
	 */
	public List<MajorBean> findAllMajor(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<MajorBean> list=new ArrayList<MajorBean>();
		String sql="select * from major";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				MajorBean mb=new MajorBean();
				mb.setMid(rs.getInt(1));
				mb.setMname(rs.getString(2));
				mb.setmIntroduce(rs.getString(3));
				list.add(mb);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return list;
	}
}
