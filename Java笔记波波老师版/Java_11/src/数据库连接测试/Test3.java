package 数据库连接测试;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.test.util.DBConnection;


public class Test3 {
	
	
	//测试数据库连接 ，使用prepareStatement 删除数据
	public static void main(String[] args) {
		
		System.out.println("请输入你要删除的学员姓名:");
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		 
		//得到连接
		Connection conn=DBConnection.getConnection();
		//编写sql语句
		String sql="delete from table1 where t_name=?";
		
		//创建PreparedStatement
		
		PreparedStatement  pstm=null;
		
		try {
			
			pstm = conn.prepareStatement(sql);
			
			//为sql语句注入参数
			pstm.setString(1, name);
			 
			//执行sql语句
			int n=pstm.executeUpdate();
			
			System.out.println("成功删除"+n+"条");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DBConnection.close(pstm, conn);  //关闭连接
		
		
		
		
			
	}
		
		
	
}
