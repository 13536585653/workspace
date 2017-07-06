package p282_4Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List list=new ArrayList();
		Student sut1=new Student("张三","男",23);
		Student sut2=new Student("李四","男",18);
		Student sut3=new Student("王五","女",22);
		
		list.add(sut1);
		list.add(sut2);
		list.add(sut3);
		
		System.out.println(list.size());//输出list的大小
		System.out.println("********"+"\n");
		System.out.println(list.isEmpty());//判断列表是否为空
		System.out.println("********"+"\n");
		//list.remove(1);//移除下标为0的元素
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
