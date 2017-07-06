package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.ProjectBean;
import org.demo.util.DBUtil;

public class ProjectDao {
	/**
	 * 添加竞赛的方法
	 * @param pb
	 * @return
	 */
	public int addProject(ProjectBean pb){
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into Project values(?,?)";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, pb.getProjectname());
			ps.setString(2, pb.getRemark());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
			return i;
	}
	
	/**
	 * 查询全部竞争项目
	 * @return
	 */
	public List<ProjectBean> findProject(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<ProjectBean> list=new ArrayList<ProjectBean>();
		String sql="select * from Project ";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				ProjectBean pb=new ProjectBean();
				pb.setProjectid(rs.getInt(1));
				pb.setProjectname(rs.getString(2));
				pb.setRemark(rs.getString(3));
				list.add(pb);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
}
