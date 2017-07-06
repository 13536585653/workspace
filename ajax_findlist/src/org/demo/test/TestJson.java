package org.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.demo.entity.UserBean;
import org.junit.Test;

import com.google.gson.Gson;

public class TestJson {
	@Test
	public static void main(String args[]){
		UserBean u1=new UserBean();
		u1.setName("袁旺");
		u1.setAge(22);
		u1.setAddress("赣州");
		UserBean u2=new UserBean();
		u2.setName("wang");
		u2.setAge(23);
		u2.setAddress("江西");
		List<UserBean> list =new ArrayList<UserBean>();
		list.add(u1);
		list.add(u2);
		
		//将对象转换成json字符串
		Gson gson=new Gson();
		String gson2=gson.toJson(list);
		System.out.println(gson2);
	}
}
