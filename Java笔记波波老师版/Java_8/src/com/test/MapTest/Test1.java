package com.test.MapTest;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import com.test.MapTest.Student;

public class Test1 {
	
	public static void main(String[] args) {
		
		Student  stu1=new Student("00128001","张三",18,"男");
		Student  stu2=new Student("00128002","张四",18,"男");
		Student  stu3=new Student("00128003","张伍",18,"男");
		Student  stu4=new Student("00128004","张六",18,"男");
		
		/*
		 使用list或set存数据，查找指定数据时，需要遍历整个集合.
		
		List<Student> list=new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		
		//找学号为00128002的学员
		for (Student student : list) {
			
			if(student.getNo().equals("00128002"))
				System.out.println(student);
		}
		
		*/
		
		/*
		 * 使用map存放数据，可以用student.no 作为key, value就是student对象
		 * 查找数据时，可以直接通过key去获得对应的value
		 * 
		 */
		Map<String,Student>  map=new HashMap<String,Student>();
		
		map.put(stu1.getNo(),stu1);
		map.put(stu2.getNo(),stu2);
		map.put(stu3.getNo(),stu3);
		map.put(stu4.getNo(),stu4);
		
		//找学号为00128002的学员
		Student s=map.get("00128002");
		
		System.out.println(s);
		System.out.println("***************************");
		//输出map里的全部值
		
		Set<String> keys=map.keySet();   //获得map里全部的key 
		for (String key : keys) {    //循环所有key ,通过key获得每个value
			System.out.println(key+"-----"+map.get(key));
		}
		
	}

}
