package ���ݿ����Ӳ���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.test.util.DBConnection;


public class Test3 {
	
	
	//�������ݿ����� ��ʹ��prepareStatement ɾ������
	public static void main(String[] args) {
		
		System.out.println("��������Ҫɾ����ѧԱ����:");
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		 
		//�õ�����
		Connection conn=DBConnection.getConnection();
		//��дsql���
		String sql="delete from table1 where t_name=?";
		
		//����PreparedStatement
		
		PreparedStatement  pstm=null;
		
		try {
			
			pstm = conn.prepareStatement(sql);
			
			//Ϊsql���ע�����
			pstm.setString(1, name);
			 
			//ִ��sql���
			int n=pstm.executeUpdate();
			
			System.out.println("�ɹ�ɾ��"+n+"��");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DBConnection.close(pstm, conn);  //�ر�����
		
		
		
		
			
	}
		
		
	
}
