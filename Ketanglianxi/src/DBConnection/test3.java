package DBConnection;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你要修改的食物的id");
		int id=input.nextInt();
		System.out.println("请输入你修改后食物名：");
		String name=input.next();
		System.out.println("请输入你修改后食物的价钱");
		String address=input.nextLine();
		
		//获得连接
		Connection conn=DBConnection.getConnection();
		//编写sql语句
		String sql="update product"+" set food=?,set price=?"+" where id";
		//创建pstm
		PreparedStatement pstm=null;
		try {
			pstm=conn.prepareStatement(sql);
			//为sql语句注入参数
			pstm.setString(1, name);
			pstm.setString(2, address);
			pstm.setInt(3, id);
			int n=pstm.executeUpdate();//执行sql语句
			System.out.println("修改了"+n+"条");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnection.close(pstm, conn);
	}
}
