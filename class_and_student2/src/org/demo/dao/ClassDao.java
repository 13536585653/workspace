package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.ClassBean;
import org.demo.util.DBUtil;
import org.junit.Test;

public class ClassDao {
	/**
	 * 添加班级的方法
	 * @param c
	 * @return
	 */
	public int addClass(ClassBean c){
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into Class values(?)";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, c.getCname());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return i;
	}

	/**
	 * 查询全部班级的方法
	 * @return
	 */
	public List<ClassBean> findClass(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<ClassBean> list=new ArrayList<ClassBean>();
		String sql="select * from Class";
		try {
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				ClassBean cb=new ClassBean();
				cb.setCid(rs.getInt(1));
				cb.setCname(rs.getString(2));
				list.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
	/**
	 * 测试查询方法
	 */
	@Test
	public void main() {
		ClassDao cd=new ClassDao();
		List<ClassBean> list=cd.findClass();
		for (ClassBean cb : list) {
			System.out.println(cb.getCname());
		}
	}
}
