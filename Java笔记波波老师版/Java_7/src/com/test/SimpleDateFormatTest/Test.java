package com.test.SimpleDateFormatTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class Test {

	  public static void main(String[] args) {
		
		   /*
		    * 
		    * 将当前日期，以 2016-1-1 02:02:05 格式输出
		    *  以 2016年1月1日 12点 02分 05秒 输出
		    */
		  
		  Date  date=new Date();
		  
		  SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  String s1=sdf1.format(date);  //将日期格式化成字符串
		  
		  SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH点 mm分ss秒 ");
		  String s2=sdf2.format(date);
		  
		  System.out.println(date);
		  System.out.println(s1);
		  System.out.println(s2);
		  
		  
		  
	}
}
