package org.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.demo.entity.ClassBean;
import org.demo.entity.StudentBean;
import org.demo.util.DBUtil;
import org.junit.Test;

public class StudentDao {
	/**
	 * 添加学生的方法
	 * @param sb
	 * @return
	 */
	public int addStudent(StudentBean sb){
		Connection conn=null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into Student values(?,?,?,?)";
		
		try {
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, sb.getSname());
			ps.setInt(2, sb.getSage());
			ps.setString(3, sb.getSsex());
			ps.setString(4, sb.getCname().getCname());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	/**
	 * 查询全部学生、班级的方法
	 * @return
	 */
	public List<StudentBean> findStudent(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<StudentBean> list=new ArrayList<StudentBean>();
		String sql="select * from Student left join Class on c_id=cid";
		try {
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				StudentBean Student=new StudentBean();
				Student.setSname(rs.getString(2));
				Student.setSage(rs.getInt(3));
				Student.setSsex(rs.getString(4));
				ClassBean cb=new ClassBean();
				cb.setCname(rs.getString(7));
				Student.setCname(cb);
				list.add(Student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
	
	/**
	 * 测试学生查询的方法
	 */
	//@Test
	public void test() {
		StudentDao sd=new StudentDao();
		List<StudentBean> list=sd.findStudent();
		for (StudentBean sb : list) {
			System.out.println(sb.getCname());
		}
	}
	
	/**
	 * 查询所有班级的男生和女生的总人数
	 * 
	 * @return
	 */
	public List<StudentBean> findStudents(){
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	List<StudentBean> list=new ArrayList<StudentBean>();
	String sql="select cname as 班级,ssex as 性别,count(sid) as 人数 from Student inner join Class on c_id=cid group by cname,ssex";
	try {
		conn=DBUtil.getConnection();
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()){
			ClassBean cb=new ClassBean();
			cb.setCname(rs.getString(1));
			StudentBean sb=new StudentBean();
			sb.setSsex(rs.getString(2));
			sb.setSid(rs.getInt(3));
			sb.setCname(cb);
			list.add(sb);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		DBUtil.close(rs, ps, conn);
	}
	return list;
}
	/**
	 * 测试查询所有班级的男生和女生的总人数
	 */
	//@Test
	public  void main() {
		StudentDao sd=new StudentDao();
		List<StudentBean> list=sd.findStudents();
		for (StudentBean sb : list) {
			System.out.println(sb.getSname());
			System.out.println();
			System.out.println(sb.getSage());
			System.out.println();
			System.out.println(sb.getSsex());
		}
	}


	/**
	 * 查询各个班级年龄大于18岁的总人数
	 * @return
	 */
	public List<StudentBean> findStudent1(){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<StudentBean> list=new ArrayList<StudentBean>();
		String sql="select cname as 班级,sname as 姓名,sage as 年龄,ssex as 性别,count(sid) as 人数  from Student inner join Class on c_id=cid group by cname,sname,sage,ssex having sage>18";
		try {
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				StudentBean Student=new StudentBean();
				Student.setSname(rs.getString(2));
				Student.setSage(rs.getInt(3));
				Student.setSsex(rs.getString(4));
				Student.setSid(rs.getInt(5));
				ClassBean cb=new ClassBean();
				cb.setCname(rs.getString(1));
				Student.setCname(cb);
				list.add(Student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ps, conn);
		}
		return list;
	}
	
	@Test
	public  void main1() {
		StudentDao sd=new StudentDao();
		List<StudentBean> list=sd.findStudent1();
		for (StudentBean sb : list) {
			System.out.println(sb.getCname().getCname());
			System.out.println();
			System.out.println(sb.getSage());
			System.out.println();
			System.out.println(sb.getSsex());
		}
	}
	
}