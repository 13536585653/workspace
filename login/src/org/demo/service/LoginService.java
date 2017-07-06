package org.demo.service;

import org.demo.dao.UserDao;
import org.demo.entity.User;

public class LoginService {
	/*
	 * 校验用户的合法性
	 */
	public User checkUser(User user){
		UserDao dao=new UserDao();
		User newUser=dao.findUser(user);
		if(newUser!=null){
			//校验用户的密码
			if(newUser.getPassword().equals(user.getPassword())){
				return user;
			}
		}
		return null;
	}
}
