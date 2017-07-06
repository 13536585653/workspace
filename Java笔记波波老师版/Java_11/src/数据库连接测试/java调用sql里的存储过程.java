package ���ݿ����Ӳ���;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.test.util.DBConnection;

public class Test6 {
	
	public static void main(String[] args) {
		
		/*
		 * java����sql��Ĵ洢����
		 * 
		 */
		
		//�������
		Connection  conn=DBConnection.getConnection();
		
		//��д���ô洢���̵����
		//String sql="{call p1()}";
		//String sql="{call p2(?)}";
		//String sql="{?=call p3(?)}";   //{num=call p3(age)};
		String sql="{call p4(?,?)}";
		
		//����һ��CallableStatement
		CallableStatement cstm=null;
		int num=0,age=30;
		
		try {
			cstm=conn.prepareCall(sql);
			cstm.setInt(1,age);
			cstm.setInt(2, num);
			//���ò���2Ϊout�Ͳ���
			cstm.registerOutParameter(2, java.sql.Types.BIGINT);
			//ִ�д洢����
			cstm.execute();
			num=cstm.getInt(2);   //��cstm�У�ȡ����2��������ֵ
			
			System.out.println("����Ϊ:"+num);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ִ�����");
		
		DBConnection.close(cstm,conn);
		
	}

}
