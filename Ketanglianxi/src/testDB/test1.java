package testDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stm=null;
		//�������
		try {
		  conn=DBConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��д���ô洢���̵����
		String sql="{call p4(?,?)}";
		//����һ��CallableStatement
		CallableStatement cstm=null;
		int num=0,age=30;
		
		try {
			cstm=conn.prepareCall(sql);
			cstm.setInt(1, age);
			cstm.setInt(2, num);
			stm=conn.createStatement();
			String sql2="insert into table1 values(1,'����','�麣',25,13538944893)";
			int n=stm.executeUpdate(sql2);
			System.out.println("����"+n+"������");
			String sql3="insert into table1 values(2,'����','����',22,12422434343)";
			int n1=stm.executeUpdate(sql3);
			System.out.println("����"+n1+"������");
			String sql4="insert into table1 values(3,'����','�Ϻ�',24,23432535555)";
			int n2=stm.executeUpdate(sql4);
			System.out.println("����"+n2+"������");
			String sql5="delete from table1 where t_id=1";
			int n3=stm.executeUpdate(sql5);
			System.out.println("ɾ����"+n3+"������");
			//���ò���2Ϊout�͵Ĳ���
			cstm.registerOutParameter(2, java.sql.Types.BIGINT);
			//ִ�д洢����
			cstm.execute();
			num=cstm.getInt(2); //��cstm�У�ȡ����2��������ֵ
			System.out.println("����Ϊ��"+num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ִ�����");
		DBConnection.close(cstm, conn);
	}
}	
