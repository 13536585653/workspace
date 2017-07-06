package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.test.bean.Vote;
import com.test.util.DBUtil;

public class VoteDao {

	
	//添加数据
	public void add(Vote  vote){
		Connection conn=DBUtil.getConnection();
		String sql="insert into vote(v_title,v_desc,v_type)" +
				" values(?,?,?)";
		
		PreparedStatement pstm=null;
		
		try {
			pstm=conn.prepareStatement(sql);
		    pstm.setString(1, vote.getV_title());
		    pstm.setString(2, vote.getV_desp());
		    pstm.setString(3, vote.getV_type());
		
		    pstm.executeUpdate();
		    
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, pstm);
		}
		
		
		
	}

	
	//查询全部投票主题
	public List<Vote> getList() {
		
		
		List<Vote> list=new ArrayList<Vote>();
		//得到连接
		Connection conn=DBUtil.getConnection();
		//编写查询的sql语句
		String sql="select * from vote";
		
		//创建pstm
		PreparedStatement  pstm=null;
		
		try {
			pstm=conn.prepareStatement(sql);
		
		  //执行查询, 得到结果集
			ResultSet rs=pstm.executeQuery();
		  
		//循环结果集，将结果集中的数据封装成vote,装入list
			while(rs.next()){
			
				int v_id=rs.getInt("v_id");
				String v_title=rs.getString("v_title");
				String v_desp=rs.getString("v_desc");
				String v_type=rs.getString("v_type");
				
				Vote vote=new Vote(v_id, v_title, v_desp, v_type);
				
				list.add(vote);
				
			}
			
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}finally{
			
			DBUtil.closeConn(conn, pstm);
		}
		
		return list;
		
	}
}
