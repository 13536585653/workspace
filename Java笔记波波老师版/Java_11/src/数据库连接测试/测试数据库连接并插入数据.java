package ���ݿ����Ӳ���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;

public class Test {
	
	
	//�������ݿ����� �����������
	public static void main(String[] args) {
		
		Connection conn=null;
		Statement  stm=null;
		
		try {
			
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);    //ע������
		    
			//ָ�������ĸ����ݿ���������ĸ����ݿ�
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=TestDB";
		    String user="sa";  //�������ݿ���û���
		    String password="";   //�������ݿ������
		    
		    //�������
		    conn=DriverManager.getConnection(url, user, password);
			
		    System.out.println("���ݿ����ӳɹ�");
		    
		    //ͨ�����ӵõ� Statement����
		    stm=conn.createStatement();
		    
		    //��дsql���
		    String sql="insert into table1 values(1,'����','�麣')";
		    
		    int n=stm.executeUpdate(sql); //ͨ��Statement����ִ��sql���
		    
		    System.out.println("����"+n+"������");
		   
		    
			
		} catch (Exception e) {
		
			 System.out.println("���ݿ�����ʧ��");
			e.printStackTrace();
			
		}finally{
			
			try {
				stm.close();     //�ر���Դ
				conn.close();    
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
