package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.test.bean.Bulletin_board;
import com.test.util.DBUtil;

public class BbDao {

	//插入数据的方法
	public void insertBb(Bulletin_board bb) {
		String sql="insert into bulletin_board(bb_title,bb_details,bb_time,bb_author) values(?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstm=null;
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, bb.getBb_title());
			pstm.setString(2, bb.getBb_details());
			pstm.setTimestamp(3, new Timestamp(new Date().getTime()));
			pstm.setString(4, bb.getBb_author());
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, pstm);
		}
		
	}

	//查询数据的方法
	public Bulletin_board selectBb(Bulletin_board bb) {
		Bulletin_board newbb=new Bulletin_board();
		String sql="select * from bulletin_board where bb_title=?";
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, bb.getBb_title());
			rs=pstm.executeQuery();
			if(rs.next()){
				newbb.setBb_title(rs.getString("bb_title"));
				newbb.setBb_details(rs.getString("bb_details"));
				newbb.setBb_time(rs.getDate("bb_time"));
				newbb.setBb_author(rs.getString("bb_author"));
				
				return newbb;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List selectBb1() {
		
		List<Bulletin_board> bblist=new ArrayList<Bulletin_board>();
		String sql="select * from bulletin_board";
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next()){

				Bulletin_board newbb=new Bulletin_board();
				newbb.setBb_id(rs.getShort("bb_id"));
				newbb.setBb_title(rs.getString("bb_title"));
				newbb.setBb_details(rs.getString("bb_details"));
				newbb.setBb_time(rs.getDate("bb_time"));
				newbb.setBb_author(rs.getString("bb_author"));
				
				bblist.add(newbb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bblist;
	}

	
	//根据bb_id查询详细公告
	public String selectBb2(int bb_id) {
		String message=null;
		String sql="select bb_details from bulletin_board where bb_id=?";
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, bb_id);
			rs=pstm.executeQuery();
			if(rs.next()){
				message=rs.getString("bb_details");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
	}

	//根据bb_id删除公告
	public void deleteBb(int bb_id) {
		String sql="delete bulletin_board where bb_id=?";
		Connection conn=null;
		PreparedStatement pstm=null;
		
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, bb_id);
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn, pstm);
		}
		
	}

}
