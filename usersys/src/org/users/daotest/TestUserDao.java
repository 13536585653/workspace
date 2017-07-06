package org.users.daotest;


import java.util.List;

import org.junit.Test;
import org.users.dao.UserDao;
import org.users.entity.UserBean;

public class TestUserDao {
	UserBean user=new UserBean();
	UserDao dao=new UserDao();
/**
 * 添加用户的方法
 */
	//@Test
	public void testAddUser(){
		user.setU_name("张三");
		user.setU_age(22);
		user.setU_address("湖南");
		user.setU_password("123");
		
		int i=dao.addUser(user);
		String msg=i==0?"添加失败":"添加成功";
		System.out.println(msg);
	}
/**
 * 测试查找全部用户的方法
 */
	//@Test
	public void testFindAllUser(){
		List<UserBean> list=dao.findAllUser();
		if(list.size()!=0){
			for (UserBean user : list) {
				System.out.println(user);
			}
		}else{
			System.out.println("没有找到相应记录！");
		}
	}
	
	/**
	 * 测试删除用户的方法
	 */
	//@Test
	public void testRemoveUser(){
		int []u_id=new int[2];
		UserBean user=new UserBean();
		user.setU_id(1005);
		user.setU_id(6);
		UserDao dao=new UserDao();
		int[] d=dao.RemoveUser(u_id);
		String msg=d==null?"删除失败":"删除成功";
		System.out.println(msg);
	}
	
	/**
	 * 测试查询某个用户的 方法
	 */
	//@Test
	public void testFindUserByName(){
		UserBean user=new UserBean();
		user.setU_name("1");
		dao.findUserByName(user);
		if(user!=null){
			System.out.println(user.getU_id());
			System.out.println(user.getU_name());
			System.out.println(user.getU_age());
			System.out.println(user.getU_address());
			System.out.println(user.getU_password());
		}
	}
}
