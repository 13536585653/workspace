package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.ClassBean;
import org.demo.entity.MajorBean;
import org.demo.entity.StudentBean;
import org.demo.util.DBUtil;
import org.junit.Test;

public class StudentDao {
	int i=0;
	/**
	 * 添加学生的方法
	 */
	public int addStudent(StudentBean sb){
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="insert into student values(?,?,?,?,?)";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, sb.getSname());
			ps.setInt(2, sb.getSage());
			ps.setString(3, sb.getSsex());
			ps.setString(4, sb.getCname().getCname());
			ps.setString(5, sb.getMname().getMname());
			i=ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(null, ps, conn);
		}
		return i;
	}
	
	/**
	 * 查询某个学生的方法
	 */
	public StudentBean findStudent(StudentBean sb){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from student where sname=?";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, sb.getSname());
			rs=ps.executeQuery();
			if(rs.next()){
				StudentBean newsb=new StudentBean();
				newsb.setSid(rs.getInt(1));
				newsb.setSname(rs.getString(2));
				newsb.setSage(rs.getInt(3));
				newsb.setSsex(rs.getString(4));
				ClassBean newcb=new ClassBean();
				newcb.setCname(rs.getString(5));
				MajorBean newmb=new MajorBean();
				newmb.setMname(rs.getString(6));
				newmb.setmIntroduce(rs.getString(7));
				newsb.setMname(newmb);
				newsb.setCname(newcb);
				return newsb;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return null;
	}
	
	@Test
	public static void main(String[] args) {
		StudentBean sb=new StudentBean();
		sb.setSid(1);
		sb.setSname("323");
	    sb.setSage(21);
		sb.setSsex("男");
		StudentDao sd=new StudentDao();
		int i=sd.addStudent(sb);
		String msg=i==0?"添加学生失败":"添加学生成功";
		System.out.println(msg);
	}
	/**
	 * 查询全部学生（班级、专业）的方法
	 * @return
	 */
	
	public List<StudentBean> findAllStudent(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<StudentBean> list=new ArrayList<StudentBean>();
		
		String sql="select * from student";
		
		try{
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				StudentBean sb=new StudentBean();
				sb.setSid(rs.getInt(1));
				sb.setSname(rs.getString(2));
				sb.setSage(rs.getInt(3));
				sb.setSsex(rs.getString(4));
				ClassBean cb=new ClassBean();
				cb.setCname(rs.getString(5));
				MajorBean mb=new MajorBean();
				mb.setMname(rs.getString(6));
				mb.setmIntroduce(rs.getString(7));
				sb.setCname(cb);
				sb.setMname(mb);
				list.add(sb);
			}
		}catch(SQLException e){
			
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
}
