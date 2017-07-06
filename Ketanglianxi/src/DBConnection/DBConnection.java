package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	//���ฺ�� �������ݿ����ӣ��͹ر����ݿ���Դ
	
		private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		private static String url="jdbc:sqlserver://localhost:1433;DatabaseName=TestDB2";
		private static String user="sa";  //�������ݿ���û���
		private static String password="123";   //�������ݿ������
		
		//���������ӵķ���
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
		
		//�ر���Դ�ķ���
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
