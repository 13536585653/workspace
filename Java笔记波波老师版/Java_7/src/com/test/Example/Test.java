package com.test.Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {
	
	/*
	 *  输入 任意的日期,格式如下：2016-5-5
              输出它的星期几?
	 * 
	 */
	public static void main(String[] args) {
		
		String[] weeks={"日","一","二","三","四","五","六"};
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入日期，格式如下：2016-5-5：");
		String s=input.nextLine();
		
		SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			
			Date date=sdf.parse(s);  //将字符串转日期
			
			System.out.println(date);
			
			GregorianCalendar gc=new GregorianCalendar(); //当前日期的日历
			gc.setTime(date); //将日历设置为指定日期的日历
			
			
			int n=gc.get(Calendar.DAY_OF_WEEK);
		    System.out.println("星期"+weeks[n-1]);
		
		} catch (ParseException e) {
			System.out.println("格式错误!");
			e.printStackTrace();
		}
		
		
	}

}
