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
				System.out.println("书名:  "+book.getB_name());
				System.out.println("书籍类型:  "+book.getType().getBt_type());
				System.out.println("出版日期:  "+book.getB_date());
				System.out.println("------------------------");
			
		}
	}
	/**
	 * 测试添加书籍类型的方法
	 */
	//@Test
	public void testaddBookType(){
		BookType_Bean type=new BookType_Bean();
		type.setBt_type("高中");
		BtDao dao =new BtDao();
		int i=dao.addBookType(type);
		String msg=i==0?"添加失败":"添加成功";
		System.out.println(msg);
	}
	
	
}
