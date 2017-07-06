//Java连接数据库代码

package Java_link_SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;

public class test{
	
	
	//测试数据库连接
	public static void main(String[] args) {
		 Connection conn=null;
		 Statement  stm=null;
		try {
			
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);    //注册驱动
		    
			//指明连接哪个数据库服务器的哪个数据库
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=TestDB";
		    String user="sa";  //连接数据库的用户名
		    String password="123";   //连接数据库的密码
		    
		   conn=DriverManager.getConnection(url, user, password);
			
		    System.out.println("数据库连接成功");
			stm=conn.createStatement();//通过连接得到 Statement对象
			String sq1="insert into product values(2,'袁旺',100)";
			String sq2="insert into product values(3,'zaiduoduo',122)";
			int n=stm.executeUpdate(sq1);//通过Statement对象执行sql语句
			int n1=stm.executeUpdate(sq2);
			System.out.println("插入"+n1+"条数据");
			System.out.println("插入"+n1+"条数据");
		} catch (Exception e) {
		
			 System.out.println("数据库连接失败");
			e.printStackTrace();
			
		}finally{
			try {
				stm.close();//关闭资源
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
