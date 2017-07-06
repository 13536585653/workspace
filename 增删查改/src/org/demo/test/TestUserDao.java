package org.demo.test;

import java.util.List;

import org.demo.bean.UserBean;
import org.demo.dao.UserDao;
import org.junit.Test;

public class TestUserDao {
	//新建一个user
	UserBean user=new UserBean();
	//建一个dao方法
	UserDao dao=new UserDao();
	
	/**
	 * 测试添加的方法
	 * @author 123
	 *
	 */
	//@Test
	public void testAddUser(){
		user.setU_id(199);
		user.setU_name("yw");
		user.setU_age(21);
		user.setU_address("jx");
		
		int u=dao.addUser(user);
		String msg=u==0?"添加失败":"添加成功";
		System.out.println(msg);
	}
	
	/**
	 * 测试删除用户的方法
	 * @param args
	 */
	//@Test
	public void testRemoveUser(){
		user.setU_id(2);
		int u=dao.RemoveUser(user);
		String msg=u==0?"删除失败":"删除成功";
		System.out.println(msg);
	}
	
	/**
	 * 测试修改用户的方法
	 * @param args
	 */
	//@Test
	public void testUpdateUser(){
		//填充数据
		user.setU_id(8);
		user.setU_name("wz");
		user.setU_age(33);
		user.setU_address("gz");
		
		int u=dao.updateUser(user);
		String msg=u==0?"更新失败":"更新成功";
		System.out.println(msg);
	}
	
	/**
	 * 测试查询某个用户的方法
	 * @param args
	 */
	//@Test
	public void testFindUser(){
		user.setU_id(1);
		dao.findUserById(user);
		if(user!=null){
			System.out.println(user.getU_id());
			System.out.println(user.getU_name());
			System.out.println(user.getU_age());
			System.out.println(user.getU_address());
		}else{
			
			System.out.println("你的查找没有记录！");
		}
		
		
	}
	
	/**
	 * 测试查询全部用户的方法
	 */
	@Test
	public void testfindAllUser(){
		//将查找的全部用户赋值给list
		List<UserBean> list =dao.findAllUser();
		if(list.size()!=0){
			for (UserBean user : list) {
				System.out.println(user);
			}
//			System.out.println(user.getU_id());
//			System.out.println(user.getU_name());
//			System.out.println(user.getU_age());
//			System.out.println(user.getU_address());
//			System.out.println("-----------------");
		}else{
			System.out.println("找不到相应记录！！！！");
		}
		
	}
//写一个main方法测试
	/*public static void main(String[] args) {
		TestUserDao test=new TestUserDao();
		//test.testAddUser();
		//test.testRemoveUser();
		//test.testUpdateUser();
		//test.testFindUser();
	}
	*/
}
