package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.BookType_Bean;
import org.demo.util.DBUtil;

public class BtDao {
	/**
	 * 添加书的类型 的方法
	 * @param type
	 * @return
	 */
	public int addBookType(BookType_Bean type){
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into BookType values(?)";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, type.getBt_type());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return i;
	}
	
	/**
	 * 查询单个数据类型的方法
	 * @param type
	 * @return
	 */
	public BookType_Bean findBookType(BookType_Bean type){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from BookType where bt_type=?";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, type.getBt_type());
			rs=ps.executeQuery();
			
			if(rs.next()){
				type.setBt_id(rs.getInt(1));
				type.setBt_type(rs.getString(2));
				return type;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return null;
	}
	
	/**
	 * 查询全部书籍类别的方法
	 * @param type
	 * @return
	 */
	public List<BookType_Bean> findAllType(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<BookType_Bean> list=new ArrayList<BookType_Bean>();
		
		String sql="select * from BookType";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				BookType_Bean type=new BookType_Bean();
				type.setBt_id(rs.getInt(1));
				type.setBt_type(rs.getString(2));
				list.add(type);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
			return list;
	}
}
