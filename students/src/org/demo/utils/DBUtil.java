package org.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//连接数据库的工具类
public class DBUtil {

	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=student";
	private static String uName = "sa";
	private static String passwd = "123";

	
	//获得数据库连接的方法
	public static Connection getConnection() {
		
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, uName, passwd);
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	//关闭资源的方法
	public static void closeConn(Connection conn,Statement pstm) {
		
		if(pstm!=null){
			try {
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(getConnection());
	}
	
	
}
