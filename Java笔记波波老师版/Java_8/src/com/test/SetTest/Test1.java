package com.test.SetTest;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
	
	public static void main(String[] args) {
		
		//����һ��ѧԱ��set
		Set<Student>  set=new HashSet<Student>();
		
		Student stu1=new Student("����",22,"��");
		Student stu2=new Student("����",21,"Ů");
		
		set.add(stu1);
		set.add(stu2);
		set.add(stu2);
		
		System.out.println("set��С:"+set.size());
		
		//���set , foreach
		for (Student student : set) {
			System.out.println(student);
		}
		
		
	}

}
