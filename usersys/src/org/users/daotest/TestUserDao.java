package org.users.daotest;


import java.util.List;

import org.junit.Test;
import org.users.dao.UserDao;
import org.users.entity.UserBean;

public class TestUserDao {
	UserBean user=new UserBean();
	UserDao dao=new UserDao();
/**
 * ����û��ķ���
 */
	//@Test
	public void testAddUser(){
		user.setU_name("����");
		user.setU_age(22);
		user.setU_address("����");
		user.setU_password("123");
		
		int i=dao.addUser(user);
		String msg=i==0?"���ʧ��":"��ӳɹ�";
		System.out.println(msg);
	}
/**
 * ���Բ���ȫ���û��ķ���
 */
	//@Test
	public void testFindAllUser(){
		List<UserBean> list=dao.findAllUser();
		if(list.size()!=0){
			for (UserBean user : list) {
				System.out.println(user);
			}
		}else{
			System.out.println("û���ҵ���Ӧ��¼��");
		}
	}
	
	/**
	 * ����ɾ���û��ķ���
	 */
	//@Test
	public void testRemoveUser(){
		int []u_id=new int[2];
		UserBean user=new UserBean();
		user.setU_id(1005);
		user.setU_id(6);
		UserDao dao=new UserDao();
		int[] d=dao.RemoveUser(u_id);
		String msg=d==null?"ɾ��ʧ��":"ɾ���ɹ�";
		System.out.println(msg);
	}
	
	/**
	 * ���Բ�ѯĳ���û��� ����
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
