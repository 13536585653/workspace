package 数据库连接测试;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;

public class Test {
	
	
	//测试数据库连接 ，并添加数据
	public static void main(String[] args) {
		
		Connection conn=null;
		Statement  stm=null;
		
		try {
			
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);    //注册驱动
		    
			//指明连接哪个数据库服务器的哪个数据库
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=TestDB";
		    String user="sa";  //连接数据库的用户名
		    String password="";   //连接数据库的密码
		    
		    //获得连接
		    conn=DriverManager.getConnection(url, user, password);
			
		    System.out.println("数据库连接成功");
		    
		    //通过连接得到 Statement对象
		    stm=conn.createStatement();
		    
		    //编写sql语句
		    String sql="insert into table1 values(1,'张三','珠海')";
		    
		    int n=stm.executeUpdate(sql); //通过Statement对象执行sql语句
		    
		    System.out.println("插入"+n+"条数据");
		   
		    
			
		} catch (Exception e) {
		
			 System.out.println("数据库连接失败");
			e.printStackTrace();
			
		}finally{
			
			try {
				stm.close();     //关闭资源
				conn.close();    
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
