package DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//�������ݿ����ӣ���ɾ������
public class test2 {
	public static void main(String[] args) {
		System.out.println("��������Ҫɾ��food�����֣�");
		Scanner input=new Scanner(System.in);
		String name =input.nextLine();
		
		//�õ�����
		Connection conn=DBConnection.getConnection();
		//��дsql���
		String sql="delete from product where p_name='"+name+"'";
		
		//����statement
		
		Statement stm=null;
		
		
		try {
			stm=conn.createStatement();
			//ִ��sql���
			int n=stm.executeUpdate(sql);
			System.out.println("�ɹ�ɾ��"+n+"��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnection.close(stm, conn);
	}
}
