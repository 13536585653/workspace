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

	      //获得全部城市list
		public List<City> getList(){
			
			List<City> list=new ArrayList<City>();
			//得到连接
			Connection conn=DBUtil.getConnection();
			//编写查询的sql语句
			String sql="select * from city";
			
			//创建pstm
			PreparedStatement  pstm=null;
			
			try {
				pstm=conn.prepareStatement(sql);
			
			  //执行查询, 得到结果集
				ResultSet rs=pstm.executeQuery();
			  
			//循环结果集，将结果集中的数据封装成student,装入list
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
