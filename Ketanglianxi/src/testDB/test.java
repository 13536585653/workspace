package testDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		PreparedStatement pstm=null;
		Connection conn=null;
		food f1=new food(1,"可乐",5.0);
		food f2=new food(2,"蛋糕",4.2);
		food f3=new food(3,"奶茶",8.2);
		
		List<food> list=new ArrayList<food>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		
		try {
			conn =DBConnection.getConnection();
			String sql="insert into product1 values(?,?,?)";
			
			
			try {
				pstm=conn.prepareStatement(sql);
				for (food f : list) {
					pstm.setInt(1,f.getId());
					pstm.setString(2, f.getFood());
					pstm.setDouble(3, f.getPrice());
					
					int n=pstm.executeUpdate();
					
					System.out.println("成功插入"+n+"条");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnection.close(pstm, conn);
		
	}
}
