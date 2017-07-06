package com.employ.dao;

import java.lang.Thread.State;
import java.sql.*;

import com.employ.entity.Emp;

/**
 * ִ�����ݿ�����Ĺ�����
 * @author Administrator
 *
 */
public class BaseDao {

	private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String JDBCURL="jdbc:sqlserver://localhost:1433;databaseName=deptDb";
	private static final String USER="sa";
	private static final String PWD="";
	
	/**
	 * �������ݿ�����
	 */
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡ���ݿ����Ӷ���Ĺ�������
	 * @return ���ݿ����Ӷ���
	 */
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(JDBCURL,USER,PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * �ر����ݿ����ӣ��ͷ���Դ�Ĺ�������
	 * @param con ���ݿ����Ӷ���
	 * @param st  ���ִ�ж���
	 * @param rs  ���������
	 */
	public static void closeDb(Connection con,Statement st,ResultSet rs){
		if(rs!=null)try {rs.close();} catch (SQLException e) {
				e.printStackTrace();
			}
		if(st!=null)try {st.close();} catch (SQLException e) {
			e.printStackTrace();
		}
		if(con!=null)try {con.close();} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * ִ�����ݿ��޸ĵĹ�������
	 * @param sql Ҫִ�е�SQL[insert,update,delete]
	 * @return ִ�н����true��false
	 */
	public static boolean updateDb(String sql){
		Connection conn=getConnection();//��ȡ���ݿ����Ӷ���
		Statement st=null;
		try {
			st=conn.createStatement();//��ȡ���ִ�ж���
			
			if(st.executeUpdate(sql)>0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeDb(conn, st, null);
		}
		return false;
	}
	
	/**
	 * ִ�����ݿ��޸Ĳ����Ĺ�������
	 * @param sql Ҫִ�е�SQL���[insert,update,delete]
	 * @param objs Ҫ���뵽Ԥ����SQL�еĲ���
	 * @return ִ�н����true��false
	 */
	public static boolean updateDb(String sql,Object[] objs){
		Connection conn=getConnection();//��ȡ���ݿ����Ӷ���
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(sql);//����Ԥ�������ִ�ж���
			if(objs!=null&&objs.length>0){//�������������
				for (int i = 0; i < objs.length; i++) {
					if(objs[i]==null)
						objs[i]="";
					ps.setObject(i+1, objs[i]);
				}
			}
			if(ps.executeUpdate()>0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeDb(conn, ps, null);
		}
		return false;
	}
	
	public static void main(String[] args) {
		//���һ������
		String sql="insert into dept values('���ڲ�','����')";
		//updateDb(sql);
		
		//�����ڲ���Ϊ������
		sql="update dept set dname='������' where dno=3";
		//updateDb(sql);
		
		//ɾ��������
		sql="delete dept where dname='������'";
		//updateDb(sql);
		
		
		//���һ���µ�Ա��
		sql="insert into  emp values('dingding',23,'Ů','SQL',default,2)";
		//updateDb(sql);
		
		//���һ���µ�Ա��2
		Emp emp=new Emp(0, "Marray", 23, "��", "Java",null, 1);
		//sql="insert into  emp values('"+emp.getEname()+"',"+emp.getEage()+",'"+emp.getEsex()+"','"+emp.getEbest()+"',default,"+emp.getEdno()+")";
		//updateDb(sql);
		
		sql="insert into  emp values(?,?,?,?,default,?)";
		Object[] objs={emp.getEname(),emp.getEage(),emp.getEsex(),emp.getEbest(),emp.getEdno()};
		updateDb(sql,objs);
	}
}







