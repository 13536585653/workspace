package com.test.SortTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
	
	 //list������
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		
		Employee emp1=new Employee("����", 22, "��", 5500);
		Employee emp2=new Employee("����", 25, "Ů", 5400);
		Employee emp3=new Employee("����", 23, "��", 5800);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		System.out.println("����ǰ:");
		System.out.println(list);
		
		Collections.sort(list);  //��list����
		
		System.out.println("�����:");
		System.out.println(list);
		
		Collections.reverse(list);  //��list��ת
		
		System.out.println("��ת��:");
		System.out.println(list);
		
		
		
	}

}
