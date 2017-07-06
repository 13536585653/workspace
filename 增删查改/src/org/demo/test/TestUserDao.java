package org.demo.test;

import java.util.List;

import org.demo.bean.UserBean;
import org.demo.dao.UserDao;
import org.junit.Test;

public class TestUserDao {
	//�½�һ��user
	UserBean user=new UserBean();
	//��һ��dao����
	UserDao dao=new UserDao();
	
	/**
	 * ������ӵķ���
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
		String msg=u==0?"���ʧ��":"��ӳɹ�";
		System.out.println(msg);
	}
	
	/**
	 * ����ɾ���û��ķ���
	 * @param args
	 */
	//@Test
	public void testRemoveUser(){
		user.setU_id(2);
		int u=dao.RemoveUser(user);
		String msg=u==0?"ɾ��ʧ��":"ɾ���ɹ�";
		System.out.println(msg);
	}
	
	/**
	 * �����޸��û��ķ���
	 * @param args
	 */
	//@Test
	public void testUpdateUser(){
		//�������
		user.setU_id(8);
		user.setU_name("wz");
		user.setU_age(33);
		user.setU_address("gz");
		
		int u=dao.updateUser(user);
		String msg=u==0?"����ʧ��":"���³ɹ�";
		System.out.println(msg);
	}
	
	/**
	 * ���Բ�ѯĳ���û��ķ���
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
			
			System.out.println("��Ĳ���û�м�¼��");
		}
		
		
	}
	
	/**
	 * ���Բ�ѯȫ���û��ķ���
	 */
	@Test
	public void testfindAllUser(){
		//�����ҵ�ȫ���û���ֵ��list
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
			System.out.println("�Ҳ�����Ӧ��¼��������");
		}
		
	}
//дһ��main��������
	/*public static void main(String[] args) {
		TestUserDao test=new TestUserDao();
		//test.testAddUser();
		//test.testRemoveUser();
		//test.testUpdateUser();
		//test.testFindUser();
	}
	*/
}
