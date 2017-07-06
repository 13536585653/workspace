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
	 * ����ȫ����Ϣ�ķ���
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
	 * ����ɾ����Ϣ �ķ���
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
			//ͨ�����Ӷ������ǽ�conn���Զ������ύ��Ϊ�ֶ������ύ
			conn.setAutoCommit(false);
			ps=conn.prepareStatement(sql);
			for (int i : mid) {
				//���ò�ͬ�Ĳ���
				ps.setInt(1, i);
				//��ӵ����������Ļ�����
				ps.addBatch();
			}
			//ִ����������
			rows=ps.executeBatch();
			//�ֶ��ύ����
			conn.commit();
		}catch(SQLException e){
			e.printStackTrace();
			//�������������ع�
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
	
	//��������ɾ��
	@Test
	public void testRemoveMessage(){
		int[] mid=new int[2];
		mid[1]=234;
		mid[0]=234;
		MessageDao md=new MessageDao();
		int[] rows=md.removeMassage(mid);
		String msg=rows==null?"ɾ��ʧ��":"ɾ���ɹ�";
		System.out.println(msg);
	}
}
