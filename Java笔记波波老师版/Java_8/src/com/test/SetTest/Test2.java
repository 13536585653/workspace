package com.test.SetTest;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test2 {
	
	//����10�����ظ����������Χ 1-20
	public static void main(String[] args) {
		
		 Random  random=new Random();
         int  x;
         
         Set<Integer> set=new HashSet<Integer>();  //����һ��set�������
         
        //��ͣ�ز����������ֱ��set���ϴ�СΪ10
		while(true){	 
			 
			x=random.nextInt(20)+1;
			 set.add(x);
			
			 if(set.size()==10)
				 break;
		}
		
		
		System.out.println(set);

		
	}
	

}
