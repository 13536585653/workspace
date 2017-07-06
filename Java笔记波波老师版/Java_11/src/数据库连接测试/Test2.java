package 数据库连接测试;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.test.util.DBConnection;


public class Test2 {
	
	
	//测试数据库连接 ，并删除数据
	public static void main(String[] args) {
		
		System.out.println("请输入你要删除的学员姓名:");
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		 
		//得到连接
		Connection conn=DBConnection.getConnection();
		//编写sql语句
		String sql="delete from table1 where t_name='"+name+"'";
		
		//创建statement
		
		Statement stm=null;
		
		try {
			
			stm = conn.createStatement();
			//执行sql语句
			int n=stm.executeUpdate(sql);
			
			System.out.println("成功删除"+n+"条");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 DBConnection.close(stm, conn);  //关闭连接
		
		
		
		
			
	}
		
		
	
}
