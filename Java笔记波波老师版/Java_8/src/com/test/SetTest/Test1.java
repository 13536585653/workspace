package com.test.SetTest;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
	
	public static void main(String[] args) {
		
		//创建一个学员的set
		Set<Student>  set=new HashSet<Student>();
		
		Student stu1=new Student("张三",22,"男");
		Student stu2=new Student("李四",21,"女");
		
		set.add(stu1);
		set.add(stu2);
		set.add(stu2);
		
		System.out.println("set大小:"+set.size());
		
		//输出set , foreach
		for (Student student : set) {
			System.out.println(student);
		}
		
		
	}

}
