package ���ݿ����Ӳ���;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.test.util.DBConnection;

public class Test4 {
	
	/*�޸����� ,��ѧԱ���Ϊ1��ѧԱ��������Ϊ��ѧ�ѣ���ַ��Ϊ���
	 * 
	 *  update table1 set t_name=?,t_address=?
	 *  where t_id = ?
	 * 
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("��������Ҫ�޸ĵ�ѧԱid:");
		int id=input.nextInt();
		System.out.println("���������޸ĺ�ѧԱ����:");
	    String name=input.next();
	    System.out.println("���������޸ĺ�ѧԱ��ַ:");
	    String address=input.next();
		
		
		
		
		//�������
		Connection  conn=DBConnection.getConnection();
		
		//��дsql���
		String sql="update table1" +
				   " set t_name=?, t_address=?" +
				   " where t_id = ?";
		
		//����pstm
		PreparedStatement pstm=null;
		try {
			pstm=conn.prepareStatement(sql);
			
			//Ϊsql���ע�����
			pstm.setString(1, name);
			pstm.setString(2, address);
			pstm.setInt(3, id);
			
			int n=pstm.executeUpdate();   //ִ��sql���
			
			System.out.println("�޸���"+n+"��");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DBConnection.close(pstm, conn);
		
		
	}
	 
	
	
	

}
