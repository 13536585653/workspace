package org.users.service;

import org.users.dao.UserDao;
import org.users.entity.UserBean;

public class LoginService {
	//检查用户的service方法
	public UserBean checkUser(UserBean user){//这里的user是客户端的用户
		UserDao dao =new UserDao();
		//调用dao里面的findUserByName()方法，这里的user是从数据库里查出来的，返回给User保存
		UserBean User=dao.findUserByName(user);
		//在数据库里查这个User是否存在，如果存在，就返回这个真用户，如果不存在，就返回null。
		if(User!=null){
			if(User.getU_password().equals(user.getU_password())){
				return User;
			}
		}
		return null;
	}
}
