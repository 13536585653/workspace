package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.BookType_Bean;
import org.demo.entity.Books_Bean;
import org.demo.util.DBUtil;

public class BDao {
	/**
	 * 添加书籍的方法
	 * @param book
	 * @return
	 */
	public int addBook(Books_Bean book){
		String sql = "insert into Books values(?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try{
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, book.getB_name());
			ps.setString(2, book.getB_date());
			ps.setInt(3, book.getType().getBt_id());
			row = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return row;
	}
	
	/**
	 * 查询全部书籍的方法
	 * @return
	 */
	public List<Books_Bean> findAllBooks(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Books_Bean> list=new ArrayList<Books_Bean>();
		
		String sql="select b_id, b_name,b_date,bt_id,bt_type from Books left join BookType  on bt_id=btid";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				Books_Bean book=new Books_Bean();
				book.setB_id(rs.getInt(1));
				book.setB_name(rs.getString(2));
				book.setB_date(rs.getString(3));
				
				
				BookType_Bean type=new BookType_Bean();
				type.setBt_id(rs.getInt(4));
				type.setBt_type(rs.getString(5));
				//将类型放入book对象中
				book.setType(type);
				//将book对象放入集合中
				list.add(book);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return list;
	}
}
