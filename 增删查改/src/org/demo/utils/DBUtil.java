package org.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//���ڻ�ȡ���ݿ����Ӷ���Connection;
//�������ݿ�Ĺ�����
public class DBUtil {

	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=userDB";
	private static String uName = "sa";
	private static String passwd = "123";

	
	//������ݿ����ӵķ���
	public static Connection getConnection() {
		
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, uName, passwd);
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	//�ر���Դ�ķ���
	public static void closeConn(Connection conn,Statement stm) {
		
		if(stm!=null){
			try {
				stm.close();
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


	public static void close(Object object, PreparedStatement ps, Connection conn) {
		// TODO Auto-generated method stub
		
	}
	
	
}
