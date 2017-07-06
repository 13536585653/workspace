package com.test.service;

import com.test.bean.Admins;
import com.test.bean.Users;
import com.test.dao.AdminDao;

/*
 * admin��ҵ�����
 * */
public class AdminService {
	
	//���ù���Ա�Ƿ����
	public Admins checkAdmin(Admins admin){
		
		//ʵ����һ��admindao���󣬲�����selectAdmin����
		AdminDao admindao=new AdminDao();
		Admins newadmin=admindao.selectAdmin(admin);
		
		if(newadmin!=null){
			if(newadmin.getA_pwd().equals(admin.getA_pwd())){
				return newadmin;
			}
		}
		
		return null;
	}

	//Ϊ����Ա���������
	public void addAdmin(Admins admin) {
		
		//ʵ����һ��admindao���󣬲�������Ϊ���ݿ�������ݵķ���
		AdminDao admindao=new AdminDao();
		admindao.insertAdmin(admin);
		
		
		
	}

	//�����ͨ�û��ķ���
	public Users addUser(Users users) {
		//ʵ����һ��admindao���󣬲����ü���û��Ƿ���ڵķ���
		AdminDao admindao=new AdminDao();
		Users newuser=admindao.selectUser(users);
		
		if(newuser==null){
			admindao.insertUser(users);
			return null;
		}
		return newuser;
	}
}
