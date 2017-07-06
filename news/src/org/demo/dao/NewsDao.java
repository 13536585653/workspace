package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.NewsBean;
import org.demo.utils.DBUtil;

public class NewsDao {
	/**
	 * 查询全部新闻的方法
	 * @return
	 */
	
	public List<NewsBean> getNewsList(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<NewsBean> list = new ArrayList<NewsBean>();
		String sql="select * from news";
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				NewsBean nb=new NewsBean();
				nb.setNid(rs.getInt(1));
				nb.setNtitle(rs.getString(2));
				nb.setNauthor(rs.getString(3));
				nb.setNtype(rs.getString(4));
				nb.setNcontent(rs.getString(5));
				nb.setNarea(rs.getString(6));
				nb.setNtime(rs.getDate(7));
				list.add(nb);
			}
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
	
	/**
	 * 添加新闻的方法
	 * @param news
	 * @return
	 */
	
	public int addNews(NewsBean news){
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="insert into news values(?,?,?,?,?,?)";
		int i=0;
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, news.getNtitle());
			ps.setString(2, news.getNauthor());
			ps.setString(3, news.getNtype());
			ps.setString(4, news.getNcontent());
			ps.setString(5, news.getNarea());
			ps.setDate(6, news.getNtime());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return i;

	}
	
	
}
