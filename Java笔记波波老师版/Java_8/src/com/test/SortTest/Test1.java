package com.test.SortTest;

import java.util.Arrays;

public class Test1 {
	
	//��������
	public static void main(String[] args) {
		
		
		//������������
		int[] x={5,2,3,1,8};
		
		Arrays.sort(x);   //����
	 
		for (int i : x) {
			System.out.println(i);
		}
		
		
		//�ַ�����������
		String[]  ss={"abc","bcc","cca","bac"};
		Arrays.sort(ss);
		for (String s : ss) {
			
			System.out.print(s+"--");
		}
		
		System.out.println("***************");
		
		//������������
		Employee emp1=new Employee("����",22,"��",5500);
		Employee emp2=new Employee("����",24,"��",4400);
		Employee emp3=new Employee("����",25,"��",3300);
		
		Employee[] emps={emp1,emp2,emp3};
		
		Arrays.sort(emps);
		
		for (Employee e : emps) {
			System.out.println(e);
		}
		
		
	}
	

}
