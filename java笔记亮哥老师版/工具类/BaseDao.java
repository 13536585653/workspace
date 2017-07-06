package com.employ.dao;

import java.lang.Thread.State;
import java.sql.*;

import com.employ.entity.Emp;

/**
 * 执行数据库操作的公共类
 * @author Administrator
 *
 */
public class BaseDao {

	private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String JDBCURL="jdbc:sqlserver://localhost:1433;databaseName=deptDb";
	private static final String USER="sa";
	private static final String PWD="";
	
	/**
	 * 加载数据库驱动
	 */
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取数据库连接对象的公共方法
	 * @return 数据库连接对象
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
	 * 关闭数据库连接，释放资源的公共方法
	 * @param con 数据库连接对象
	 * @param st  语句执行对象
	 * @param rs  结果集对象
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
	 * 执行数据库修改的公共方法
	 * @param sql 要执行的SQL[insert,update,delete]
	 * @return 执行结果，true，false
	 */
	public static boolean updateDb(String sql){
		Connection conn=getConnection();//获取数据库连接对象
		Statement st=null;
		try {
			st=conn.createStatement();//获取语句执行对象
			
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
	 * 执行数据库修改操作的公共方法
	 * @param sql 要执行的SQL语句[insert,update,delete]
	 * @param objs 要传入到预编译SQL中的参数
	 * @return 执行结果，true，false
	 */
	public static boolean updateDb(String sql,Object[] objs){
		Connection conn=getConnection();//获取数据库连接对象
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(sql);//构建预编译语句执行对象
			if(objs!=null&&objs.length>0){//传递了填充数据
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
		//添加一个部门
		String sql="insert into dept values('后勤部','做饭')";
		//updateDb(sql);
		
		//将后勤部改为做饭部
		sql="update dept set dname='做饭部' where dno=3";
		//updateDb(sql);
		
		//删除做饭部
		sql="delete dept where dname='做饭部'";
		//updateDb(sql);
		
		
		//添加一个新的员工
		sql="insert into  emp values('dingding',23,'女','SQL',default,2)";
		//updateDb(sql);
		
		//添加一个新的员工2
		Emp emp=new Emp(0, "Marray", 23, "男", "Java",null, 1);
		//sql="insert into  emp values('"+emp.getEname()+"',"+emp.getEage()+",'"+emp.getEsex()+"','"+emp.getEbest()+"',default,"+emp.getEdno()+")";
		//updateDb(sql);
		
		sql="insert into  emp values(?,?,?,?,default,?)";
		Object[] objs={emp.getEname(),emp.getEage(),emp.getEsex(),emp.getEbest(),emp.getEdno()};
		updateDb(sql,objs);
	}
}







