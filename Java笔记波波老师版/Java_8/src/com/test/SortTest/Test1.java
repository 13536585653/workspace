package com.test.SortTest;

import java.util.Arrays;

public class Test1 {
	
	//数组排序
	public static void main(String[] args) {
		
		
		//整形数组排序
		int[] x={5,2,3,1,8};
		
		Arrays.sort(x);   //排序
	 
		for (int i : x) {
			System.out.println(i);
		}
		
		
		//字符串数组排序
		String[]  ss={"abc","bcc","cca","bac"};
		Arrays.sort(ss);
		for (String s : ss) {
			
			System.out.print(s+"--");
		}
		
		System.out.println("***************");
		
		//对象数组排序
		Employee emp1=new Employee("张三",22,"男",5500);
		Employee emp2=new Employee("李四",24,"男",4400);
		Employee emp3=new Employee("王五",25,"男",3300);
		
		Employee[] emps={emp1,emp2,emp3};
		
		Arrays.sort(emps);
		
		for (Employee e : emps) {
			System.out.println(e);
		}
		
		
	}
	

}
