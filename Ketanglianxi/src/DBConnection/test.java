package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) {
		Connection conn=null;
		Statement  stm=null;
try {
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);    //注册驱动
		    
			//指明连接哪个数据库服务器的哪个数据库
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=testDB2";
		    String user="loginname";  //连接数据库的用户名
		    String password="123";   //连接数据库的密码
		    
		    conn=DriverManager.getConnection(url, user, password);
			
		    System.out.println("数据库连接成功");
		    
			stm=conn.createStatement();
			String sql="insert into product values(1,'可乐',4.00)";
			
			int n=stm.executeUpdate(sql);
			System.out.println("插入"+n+"条数据");
		} catch (Exception e) {
		
			 System.out.println("数据库连接失败");
			 e.printStackTrace();
			
		}finally{
			try {
				stm.close();     //关闭资源
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}

}