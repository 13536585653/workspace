package com.test.SetTest;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test2 {
	
	//产生10个不重复的随机数范围 1-20
	public static void main(String[] args) {
		
		 Random  random=new Random();
         int  x;
         
         Set<Integer> set=new HashSet<Integer>();  //创建一个set存放整数
         
        //不停地产生随机数，直到set集合大小为10
		while(true){	 
			 
			x=random.nextInt(20)+1;
			 set.add(x);
			
			 if(set.size()==10)
				 break;
		}
		
		
		System.out.println(set);

		
	}
	

}
