package com.test.MapTest;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import com.test.MapTest.Student;

public class Test1 {
	
	public static void main(String[] args) {
		
		Student  stu1=new Student("00128001","����",18,"��");
		Student  stu2=new Student("00128002","����",18,"��");
		Student  stu3=new Student("00128003","����",18,"��");
		Student  stu4=new Student("00128004","����",18,"��");
		
		/*
		 ʹ��list��set�����ݣ�����ָ������ʱ����Ҫ������������.
		
		List<Student> list=new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		
		//��ѧ��Ϊ00128002��ѧԱ
		for (Student student : list) {
			
			if(student.getNo().equals("00128002"))
				System.out.println(student);
		}
		
		*/
		
		/*
		 * ʹ��map������ݣ�������student.no ��Ϊkey, value����student����
		 * ��������ʱ������ֱ��ͨ��keyȥ��ö�Ӧ��value
		 * 
		 */
		Map<String,Student>  map=new HashMap<String,Student>();
		
		map.put(stu1.getNo(),stu1);
		map.put(stu2.getNo(),stu2);
		map.put(stu3.getNo(),stu3);
		map.put(stu4.getNo(),stu4);
		
		//��ѧ��Ϊ00128002��ѧԱ
		Student s=map.get("00128002");
		
		System.out.println(s);
		System.out.println("***************************");
		//���map���ȫ��ֵ
		
		Set<String> keys=map.keySet();   //���map��ȫ����key 
		for (String key : keys) {    //ѭ������key ,ͨ��key���ÿ��value
			System.out.println(key+"-----"+map.get(key));
		}
		
	}

}
