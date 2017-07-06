package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.bean.City;
import com.test.bean.Student;
import com.test.util.DBUtil;

public class CityDao {

	      //���ȫ������list
		public List<City> getList(){
			
			List<City> list=new ArrayList<City>();
			//�õ�����
			Connection conn=DBUtil.getConnection();
			//��д��ѯ��sql���
			String sql="select * from city";
			
			//����pstm
			PreparedStatement  pstm=null;
			
			try {
				pstm=conn.prepareStatement(sql);
			
			  //ִ�в�ѯ, �õ������
				ResultSet rs=pstm.executeQuery();
			  
			//ѭ�����������������е����ݷ�װ��student,װ��list
				while(rs.next()){
					int id=rs.getInt("c_id");
					String name=rs.getString("c_name");
					
					
					City city=new City(id, name);
					
					list.add(city);
				}
				
				
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			
			}finally{
				
				DBUtil.closeConn(conn, pstm);
			}
			
			
			
			return list;
		}
}
