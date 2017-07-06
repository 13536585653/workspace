package com.test.GregorianCalendarTest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {
 
	  public static void main(String[] args) {
		
		  //当前系统时间的日历对象
		  GregorianCalendar  calendar =new GregorianCalendar();
		  String[] weeks={"日","一","二","三","四","五","六"};
		  
		  
  System.out.println("年份:"+calendar.get(Calendar.YEAR));
  System.out.println("月:"+(calendar.get(Calendar.MONTH)+1));
  System.out.println("日期:"+calendar.get(Calendar.DATE));	
  System.out.println("小时:"+calendar.get(Calendar.HOUR));
  System.out.println("分钟:"+calendar.get(Calendar.MINUTE));
  System.out.println("秒:"+calendar.get(Calendar.SECOND));
  int n=calendar.get(Calendar.DAY_OF_WEEK);
  System.out.println("星期"+weeks[n-1]);
 
   }
	
}
