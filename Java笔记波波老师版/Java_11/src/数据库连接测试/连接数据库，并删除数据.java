package ���ݿ����Ӳ���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.test.util.DBConnection;


public class Test2 {
	
	
	//�������ݿ����� ����ɾ������
	public static void main(String[] args) {
		
		System.out.println("��������Ҫɾ����ѧԱ����:");
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		 
		//�õ�����
		Connection conn=DBConnection.getConnection();
		//��дsql���
		String sql="delete from table1 where t_name='"+name+"'";
		
		//����statement
		
		Statement stm=null;
		
		try {
			
			stm = conn.createStatement();
			//ִ��sql���
			int n=stm.executeUpdate(sql);
			
			System.out.println("�ɹ�ɾ��"+n+"��");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 DBConnection.close(stm, conn);  //�ر�����
		
		
		
		
			
	}
		
		
	
}
