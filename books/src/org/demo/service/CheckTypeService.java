package org.demo.service;

import org.demo.dao.BtDao;
import org.demo.entity.BookType_Bean;

public class CheckTypeService {
	public int checkTs(BookType_Bean type){
		BtDao dao = new BtDao();
		//���ж����ݿ��Ƿ���ڴ�����
		if(dao.findBookType(type)!=null){
			return 0;
		}else{
			//�����鼮���ͱ��浽���ݿ�
			return dao.addBookType(type);
		}
	}
	
}
