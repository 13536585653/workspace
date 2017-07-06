package 数据库连接测试;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.test.util.DBConnection;

public class Test6 {
	
	public static void main(String[] args) {
		
		/*
		 * java调用sql里的存储过程
		 * 
		 */
		
		//获得链接
		Connection  conn=DBConnection.getConnection();
		
		//编写调用存储过程的语句
		//String sql="{call p1()}";
		//String sql="{call p2(?)}";
		//String sql="{?=call p3(?)}";   //{num=call p3(age)};
		String sql="{call p4(?,?)}";
		
		//创建一个CallableStatement
		CallableStatement cstm=null;
		int num=0,age=30;
		
		try {
			cstm=conn.prepareCall(sql);
			cstm.setInt(1,age);
			cstm.setInt(2, num);
			//设置参数2为out型参数
			cstm.registerOutParameter(2, java.sql.Types.BIGINT);
			//执行存储过程
			cstm.execute();
			num=cstm.getInt(2);   //从cstm中，取出第2个参数的值
			
			System.out.println("人数为:"+num);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("执行完毕");
		
		DBConnection.close(cstm,conn);
		
	}

}
