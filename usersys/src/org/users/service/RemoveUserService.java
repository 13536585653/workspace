package org.users.service;

import org.users.dao.UserDao;

public class RemoveUserService {
	public int[] RemoveUser(String[] u_id){
		//将String型的 数组u_id强转为int型数组
		int[] uids=new int[u_id.length];
		for (int i = 0; i < uids.length; i++) {
			uids[i]=Integer.parseInt(u_id[i]);
		}
		//业务处理完后掉用dao层进行删除操作
		UserDao dao=new UserDao();
		int []rows=dao.RemoveUser(uids);
		return rows;
	}
}
