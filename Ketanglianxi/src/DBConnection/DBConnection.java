package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	//此类负责 建立数据库连接，和关闭数据库资源
	
		private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		private static String url="jdbc:sqlserver://localhost:1433;DatabaseName=TestDB2";
		private static String user="sa";  //连接数据库的用户名
		private static String password="123";   //连接数据库的密码
		
		//负责建立连接的方法
		public static Connection getConnection(){
			Connection conn=null;
			try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		
		//关闭资源的方法
		public static void close(Statement stm,Connection conn){
				if(stm!=null){
					try {
						stm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(conn!=null){
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				}
			
		}
		
		
}
