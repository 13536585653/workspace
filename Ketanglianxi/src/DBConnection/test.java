package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) {
		Connection conn=null;
		Statement  stm=null;
try {
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);    //ע������
		    
			//ָ�������ĸ����ݿ���������ĸ����ݿ�
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=testDB2";
		    String user="loginname";  //�������ݿ���û���
		    String password="123";   //�������ݿ������
		    
		    conn=DriverManager.getConnection(url, user, password);
			
		    System.out.println("���ݿ����ӳɹ�");
		    
			stm=conn.createStatement();
			String sql="insert into product values(1,'����',4.00)";
			
			int n=stm.executeUpdate(sql);
			System.out.println("����"+n+"������");
		} catch (Exception e) {
		
			 System.out.println("���ݿ�����ʧ��");
			 e.printStackTrace();
			
		}finally{
			try {
				stm.close();     //�ر���Դ
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}

}