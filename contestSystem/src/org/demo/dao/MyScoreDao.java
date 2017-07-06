package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.MyScoreBean;
import org.demo.entity.ProjectBean;
import org.demo.util.DBUtil;

public class MyScoreDao {
	/**
	 * ������ֵķ���
	 * @param msb
	 * @return
	 */
	public int addMyScore(MyScoreBean msb){
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into myScore values(?,?,?,?,?,?)";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, msb.getProject().getProjectid());
			ps.setDouble(2, msb.getUi());
			ps.setDouble(3, msb.getCode());
			ps.setDouble(4, msb.getDocument());
			ps.setDouble(5, msb.getSpeech());
			ps.setTimestamp(6, msb.getSdate());
			
			i=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return i;
	}
	
	/**
	 * ��ѯȫ��������Ϣ����
	 * @return
	 */
	public List<MyScoreBean> findMyScore(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<MyScoreBean> list=new ArrayList<MyScoreBean>();
		String sql="select projectname as ��Ŀ����,ui as UI�÷�,code as ����÷�,document as �ĵ��÷�,speech as �ݽ��÷�,sdate as ����ʱ�� from Project p inner join myScore s on s.Projectid=p.projectid group by projectname,ui,code,document,speech,sdate ";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				ProjectBean pb=new ProjectBean();
				pb.setProjectname(rs.getString(1));
				MyScoreBean msb=new MyScoreBean();
				msb.setUi(rs.getFloat(2));
				msb.setCode(rs.getFloat(3));
				msb.setDocument(rs.getFloat(4));
				msb.setSpeech(rs.getFloat(5));
				msb.setSdate(rs.getTimestamp(6));
				msb.setProject(pb);
				list.add(msb);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
}
