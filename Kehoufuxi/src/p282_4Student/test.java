package p282_4Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List list=new ArrayList();
		Student sut1=new Student("����","��",23);
		Student sut2=new Student("����","��",18);
		Student sut3=new Student("����","Ů",22);
		
		list.add(sut1);
		list.add(sut2);
		list.add(sut3);
		
		System.out.println(list.size());//���list�Ĵ�С
		System.out.println("********"+"\n");
		System.out.println(list.isEmpty());//�ж��б��Ƿ�Ϊ��
		System.out.println("********"+"\n");
		//list.remove(1);//�Ƴ��±�Ϊ0��Ԫ��
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
