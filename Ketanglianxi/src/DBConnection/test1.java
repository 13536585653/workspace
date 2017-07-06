package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class test1 {
	

	public static void main(String[] args) {
		Connection conn=null;
		Statement  stm=null;
		Food f1=new Food(1,"可乐",3);
		Food f2=new Food(2,"蛋糕",5);
		Food f3=new Food(3,"奶茶",8);
		
		List<Food> list=new ArrayList<Food>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		
		conn=DBConnection.getConnection();
		String sql="insert into product values(?,?,?)";
		PreparedStatement pstm=null;
		try {
			pstm=conn.prepareStatement(sql);
			for (Food f : list) {
				pstm.setInt(1, f.getId());
				pstm.setString(2, f.getFood());
				pstm.setDouble(3, f.getPrice());
				int n=pstm.executeUpdate();
				System.out.println("成功插入"+n+"条");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnection.close(stm, conn);
		
	}
}
