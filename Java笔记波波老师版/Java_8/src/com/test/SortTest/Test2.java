package com.test.SortTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
	
	 //list的排序
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		
		Employee emp1=new Employee("张三", 22, "男", 5500);
		Employee emp2=new Employee("李四", 25, "女", 5400);
		Employee emp3=new Employee("王五", 23, "男", 5800);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		System.out.println("排序前:");
		System.out.println(list);
		
		Collections.sort(list);  //将list排序
		
		System.out.println("排序后:");
		System.out.println(list);
		
		Collections.reverse(list);  //将list反转
		
		System.out.println("反转后:");
		System.out.println(list);
		
		
		
	}

}
