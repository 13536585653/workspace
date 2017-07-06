package org.demo.service;

import org.demo.dao.BtDao;
import org.demo.entity.BookType_Bean;

public class CheckTypeService {
	public int checkTs(BookType_Bean type){
		BtDao dao = new BtDao();
		//先判断数据库是否存在此类型
		if(dao.findBookType(type)!=null){
			return 0;
		}else{
			//否则将书籍类型保存到数据库
			return dao.addBookType(type);
		}
	}
	
}
