package 数据库连接测试;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.test.util.DBConnection;

public class Test5 {
	
	public static void main(String[] args) {
		
		//查询数据
		Connection  conn=DBConnection.getConnection();
		
		//编写查询的语句
		String sql="select * from table1";
		
		//创建pstm
		PreparedStatement pstm=null;
		
		try {
			pstm=conn.prepareStatement(sql);
		
			//执行查询，得到结果集
			ResultSet rs=pstm.executeQuery();
		
			List<Student> list=new ArrayList<Student>();
			
		    //从结果集中取数据 ,并封装成对象，添加到list中
			while(rs.next()){
				Student s=new Student();
				
				s.setT_id(rs.getInt(1));   //按列的顺序取值，
				s.setT_name(rs.getString("t_name"));  //按列名取数据
				s.setT_address(rs.getString("t_address"));
			    
				list.add(s);   //加入list中
			}		
		
			System.out.println("一共"+list.size()+"条记录:");
			
			//循环输出list
			for (Student s : list) {
				System.out.println(s);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnection.close(pstm, conn);
		
		
	}

}
