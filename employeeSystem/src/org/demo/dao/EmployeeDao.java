package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.EmployeeBean;
import org.demo.util.DBUtil;

public class EmployeeDao {
	/**
	 * 查找全部员工的方法
	 * @return
	 */
	public List<EmployeeBean> findEmployee(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBean> list=new ArrayList<EmployeeBean>();
		String sql="select * from Employee";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				EmployeeBean eb=new EmployeeBean();
				eb.setEid(rs.getInt(1));
				eb.setEname(rs.getString(2));
				eb.setEage(rs.getInt(3));
				eb.setEsex(rs.getString(4));
				eb.setEemail(rs.getString(5));
				list.add(eb);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
	
	/**
	 * 添加员工的方法
	 * @param eb
	 * @return
	 */
	public boolean addEmployee(EmployeeBean eb){
		Connection conn=null;
		PreparedStatement ps=null;
		@SuppressWarnings("unused")
		boolean b=false;
		String sql="insert into Employee values(?,?,?,?)";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, eb.getEname());
			ps.setInt(2, eb.getEage());
			ps.setString(3, eb.getEsex());
			ps.setString(4, eb.getEemail());
			b=ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return true;
	}
}
