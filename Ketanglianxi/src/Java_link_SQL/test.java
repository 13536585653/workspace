//Java�������ݿ����

package Java_link_SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;

public class test{
	
	
	//�������ݿ�����
	public static void main(String[] args) {
		 Connection conn=null;
		 Statement  stm=null;
		try {
			
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);    //ע������
		    
			//ָ�������ĸ����ݿ���������ĸ����ݿ�
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=TestDB";
		    String user="sa";  //�������ݿ���û���
		    String password="123";   //�������ݿ������
		    
		   conn=DriverManager.getConnection(url, user, password);
			
		    System.out.println("���ݿ����ӳɹ�");
			stm=conn.createStatement();//ͨ�����ӵõ� Statement����
			String sq1="insert into product values(2,'Ԭ��',100)";
			String sq2="insert into product values(3,'zaiduoduo',122)";
			int n=stm.executeUpdate(sq1);//ͨ��Statement����ִ��sql���
			int n1=stm.executeUpdate(sq2);
			System.out.println("����"+n1+"������");
			System.out.println("����"+n1+"������");
		} catch (Exception e) {
		
			 System.out.println("���ݿ�����ʧ��");
			e.printStackTrace();
			
		}finally{
			try {
				stm.close();//�ر���Դ
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
