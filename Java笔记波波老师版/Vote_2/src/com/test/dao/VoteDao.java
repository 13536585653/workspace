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

	
	//�������
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

	
	//��ѯȫ��ͶƱ����
	public List<Vote> getList() {
		
		
		List<Vote> list=new ArrayList<Vote>();
		//�õ�����
		Connection conn=DBUtil.getConnection();
		//��д��ѯ��sql���
		String sql="select * from vote";
		
		//����pstm
		PreparedStatement  pstm=null;
		
		try {
			pstm=conn.prepareStatement(sql);
		
		  //ִ�в�ѯ, �õ������
			ResultSet rs=pstm.executeQuery();
		  
		//ѭ�����������������е����ݷ�װ��vote,װ��list
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
