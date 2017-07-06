package ���ݿ����Ӳ���;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.test.util.DBConnection;

public class Test5 {
	
	public static void main(String[] args) {
		
		//��ѯ����
		Connection  conn=DBConnection.getConnection();
		
		//��д��ѯ�����
		String sql="select * from table1";
		
		//����pstm
		PreparedStatement pstm=null;
		
		try {
			pstm=conn.prepareStatement(sql);
		
			//ִ�в�ѯ���õ������
			ResultSet rs=pstm.executeQuery();
		
			List<Student> list=new ArrayList<Student>();
			
		    //�ӽ������ȡ���� ,����װ�ɶ�����ӵ�list��
			while(rs.next()){
				Student s=new Student();
				
				s.setT_id(rs.getInt(1));   //���е�˳��ȡֵ��
				s.setT_name(rs.getString("t_name"));  //������ȡ����
				s.setT_address(rs.getString("t_address"));
			    
				list.add(s);   //����list��
			}		
		
			System.out.println("һ��"+list.size()+"����¼:");
			
			//ѭ�����list
			for (Student s : list) {
				System.out.println(s);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnection.close(pstm, conn);
		
		
	}

}
