package 数据库连接测试;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.test.util.DBConnection;

public class Test4 {
	
	/*修改数据 ,将学员编号为1的学员，姓名改为张学友，地址改为香港
	 * 
	 *  update table1 set t_name=?,t_address=?
	 *  where t_id = ?
	 * 
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入你要修改的学员id:");
		int id=input.nextInt();
		System.out.println("请输入你修改后学员姓名:");
	    String name=input.next();
	    System.out.println("请输入你修改后学员地址:");
	    String address=input.next();
		
		
		
		
		//获得连接
		Connection  conn=DBConnection.getConnection();
		
		//编写sql语句
		String sql="update table1" +
				   " set t_name=?, t_address=?" +
				   " where t_id = ?";
		
		//创建pstm
		PreparedStatement pstm=null;
		try {
			pstm=conn.prepareStatement(sql);
			
			//为sql语句注入参数
			pstm.setString(1, name);
			pstm.setString(2, address);
			pstm.setInt(3, id);
			
			int n=pstm.executeUpdate();   //执行sql语句
			
			System.out.println("修改了"+n+"条");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DBConnection.close(pstm, conn);
		
		
	}
	 
	
	
	

}
