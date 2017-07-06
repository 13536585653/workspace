package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.MessageBean;
import org.demo.util.DBUtil;
import org.junit.Test;

public class MessageDao {
	/**
	 * 查找全部消息的方法
	 * @return
	 */
	public List<MessageBean> findMessage(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<MessageBean> list=new ArrayList<MessageBean>();
		String sql="select * from MessageInfo";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()){
				MessageBean mb=new MessageBean();
				mb.setMid(rs.getInt(1));
				mb.setMcontent(rs.getString(2));
				mb.setPublish(rs.getDate(3));
				list.add(mb);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
	
	/**
	 * 批量删除消息 的方法
	 * @param mid
	 * @return
	 */
	public int[] removeMassage(int[] mid){
		Connection conn=null;
		PreparedStatement ps=null;
		int[] rows=null;
		
		String sql="delete from MessageInfo where mid=?";
		try{
			conn=DBUtil.getConnection();
			//通过连接对象，我们将conn的自动事务提交改为手动事务提交
			conn.setAutoCommit(false);
			ps=conn.prepareStatement(sql);
			for (int i : mid) {
				//设置不同的参数
				ps.setInt(1, i);
				//添加到批量操作的缓存中
				ps.addBatch();
			}
			//执行批量操作
			rows=ps.executeBatch();
			//手动提交事务
			conn.commit();
		}catch(SQLException e){
			e.printStackTrace();
			//在这里进行事务回滚
			try{
				conn.rollback();
			}catch(SQLException e1){
				e.printStackTrace();
			}
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return rows;
	}
	
	//测试批量删除
	@Test
	public void testRemoveMessage(){
		int[] mid=new int[2];
		mid[1]=234;
		mid[0]=234;
		MessageDao md=new MessageDao();
		int[] rows=md.removeMassage(mid);
		String msg=rows==null?"删除失败":"删除成功";
		System.out.println(msg);
	}
}
