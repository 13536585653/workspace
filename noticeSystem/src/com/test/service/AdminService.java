package com.test.service;

import com.test.bean.Admins;
import com.test.bean.Users;
import com.test.dao.AdminDao;

/*
 * admin的业务层类
 * */
public class AdminService {
	
	//检查该管理员是否存在
	public Admins checkAdmin(Admins admin){
		
		//实例化一个admindao对象，并调用selectAdmin方法
		AdminDao admindao=new AdminDao();
		Admins newadmin=admindao.selectAdmin(admin);
		
		if(newadmin!=null){
			if(newadmin.getA_pwd().equals(admin.getA_pwd())){
				return newadmin;
			}
		}
		
		return null;
	}

	//为管理员表插入数据
	public void addAdmin(Admins admin) {
		
		//实例化一个admindao对象，并调用其为数据库插入数据的方法
		AdminDao admindao=new AdminDao();
		admindao.insertAdmin(admin);
		
		
		
	}

	//添加普通用户的方法
	public Users addUser(Users users) {
		//实例化一个admindao对象，并调用检查用户是否存在的方法
		AdminDao admindao=new AdminDao();
		Users newuser=admindao.selectUser(users);
		
		if(newuser==null){
			admindao.insertUser(users);
			return null;
		}
		return newuser;
	}
}
