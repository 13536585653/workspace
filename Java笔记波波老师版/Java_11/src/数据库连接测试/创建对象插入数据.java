package ���ݿ����Ӳ���;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.util.DBConnection;

public class Test1 {
	
	//����3��ѧԱ���� 
	public static void main(String[] args) {
		
		Student stu1=new Student(1,"����","�麣");
		Student stu2=new Student(2,"����","�麣");
		Student stu3=new Student(3,"����","�麣");
		
		List<Student> list=new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		Connection conn=DBConnection.getConnection();
		
		String sql="insert into table1 values(?,?,?)";
		
		PreparedStatement pstm=null;
		
		try {
			
			pstm=conn.prepareStatement(sql);
			
			for (Student s : list) {
				
				pstm.setInt(1, s.getT_id());
				pstm.setString(2, s.getT_name());
				pstm.setString(3, s.getT_address());
				
				int n=pstm.executeUpdate();
				
				System.out.println("�ɹ�����"+n+"��");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DBConnection.close(pstm, conn);
		
		
	}
	
	

}
