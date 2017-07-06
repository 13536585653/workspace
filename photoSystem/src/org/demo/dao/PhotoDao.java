package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.PhotoBean;
import org.demo.util.DBUtil;

public class PhotoDao {
	/**
	 * 添加照片的方法
	 * @param pb
	 * @return
	 */
	public int addPhoto(PhotoBean pb){
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into photoinfo values(?,?,?,?,?)";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, pb.getName());
			ps.setInt(2, pb.getCount());
			ps.setString(3, pb.getType());
			ps.setString(4, pb.getEmail());
			ps.setString(5, pb.getTel());
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return i;
	}
	
	/**
	 * 查询全部照片信息
	 * @param photo
	 * @return
	 */
	public List<PhotoBean> findPhoto(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from photoinfo";
		List<PhotoBean> list=new ArrayList<PhotoBean>();
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				PhotoBean photo=new PhotoBean();
				photo.setName(rs.getString(2));
				photo.setCount(rs.getInt(3));
				photo.setType(rs.getString(4));
				photo.setEmail(rs.getString(5));
				photo.setTel(rs.getString(6));
				list.add(photo);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
			return list;
	}
}
