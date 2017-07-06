package org.demo.testDao;

import java.util.List;

import org.demo.dao.BDao;
import org.demo.dao.BtDao;
import org.demo.dao.UserDao;
import org.demo.entity.BookType_Bean;
import org.demo.entity.Books_Bean;
import org.demo.entity.UserBean;
import org.junit.Test;

public class TestDao {
	@Test
	public void testFindBooks(){
		BDao b=new BDao();
		List<Books_Bean> list=b.findAllBooks();
			for (Books_Bean book : list) {
				System.out.println("ID:  "+book.getB_id());
				System.out.println("����:  "+book.getB_name());
				System.out.println("�鼮����:  "+book.getType().getBt_type());
				System.out.println("��������:  "+book.getB_date());
				System.out.println("------------------------");
			
		}
	}
	/**
	 * ��������鼮���͵ķ���
	 */
	//@Test
	public void testaddBookType(){
		BookType_Bean type=new BookType_Bean();
		type.setBt_type("����");
		BtDao dao =new BtDao();
		int i=dao.addBookType(type);
		String msg=i==0?"���ʧ��":"��ӳɹ�";
		System.out.println(msg);
	}
	
	
}
