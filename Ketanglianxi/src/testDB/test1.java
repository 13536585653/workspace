package testDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stm=null;
		//获得连接
		try {
		  conn=DBConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//编写调用存储过程的语句
		String sql="{call p4(?,?)}";
		//创建一个CallableStatement
		CallableStatement cstm=null;
		int num=0,age=30;
		
		try {
			cstm=conn.prepareCall(sql);
			cstm.setInt(1, age);
			cstm.setInt(2, num);
			stm=conn.createStatement();
			String sql2="insert into table1 values(1,'张三','珠海',25,13538944893)";
			int n=stm.executeUpdate(sql2);
			System.out.println("插入"+n+"条数据");
			String sql3="insert into table1 values(2,'李四','深圳',22,12422434343)";
			int n1=stm.executeUpdate(sql3);
			System.out.println("插入"+n1+"条数据");
			String sql4="insert into table1 values(3,'王五','上海',24,23432535555)";
			int n2=stm.executeUpdate(sql4);
			System.out.println("插入"+n2+"条数据");
			String sql5="delete from table1 where t_id=1";
			int n3=stm.executeUpdate(sql5);
			System.out.println("删除了"+n3+"条数据");
			//设置参数2为out型的参数
			cstm.registerOutParameter(2, java.sql.Types.BIGINT);
			//执行存储过程
			cstm.execute();
			num=cstm.getInt(2); //从cstm中，取出第2个参数的值
			System.out.println("人数为："+num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("执行完毕");
		DBConnection.close(cstm, conn);
	}
}	
