package DBConnection;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ʳ���id");
		int id=input.nextInt();
		System.out.println("���������޸ĺ�ʳ������");
		String name=input.next();
		System.out.println("���������޸ĺ�ʳ��ļ�Ǯ");
		String address=input.nextLine();
		
		//�������
		Connection conn=DBConnection.getConnection();
		//��дsql���
		String sql="update product"+" set food=?,set price=?"+" where id";
		//����pstm
		PreparedStatement pstm=null;
		try {
			pstm=conn.prepareStatement(sql);
			//Ϊsql���ע�����
			pstm.setString(1, name);
			pstm.setString(2, address);
			pstm.setInt(3, id);
			int n=pstm.executeUpdate();//ִ��sql���
			System.out.println("�޸���"+n+"��");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnection.close(pstm, conn);
	}
}
