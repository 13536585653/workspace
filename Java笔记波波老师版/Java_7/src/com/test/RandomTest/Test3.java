package com.test.RandomTest;

import java.util.Random;

public class Test3 {
  
	 /*
	  * 赌大小, 3个筛子, [1-6]
	  *  1 1 1    6 6 6 
	  *  如果3个筛子的和 >=11 就为大   ,<=10 ,就为小
	  *  如果出现 111 ，222,333，豹子，庄家通杀
	  */
	public static void main(String[] args) {
	
		  Random random=new Random();
		  
		  int n1,n2,n3;
		  
		  n1=random.nextInt(6)+1;
		  n2=random.nextInt(6)+1;
		  n3=random.nextInt(6)+1;
		  
		  System.out.println(n1+"  "+n2+"  "+n3);
		  System.out.println("点数是:"+(n1+n2+n3));
		  
		  if(n1==n2 && n2==n3)
			  System.out.println("豹子，庄家通杀!");
		   else   if((n1+n2+n3)>=11)
			  System.out.println("大");
		  else
			  System.out.println("小");
    }
}
