package com.test.GregorianCalendarTest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {

     
	public static void main(String[] args) {
		
	    //问，今年的圣诞节是星期几？
		GregorianCalendar  xmas=new GregorianCalendar(2016,12-1,25);
		String[] weeks={"日","一","二","三","四","五","六"};
		
		int n=xmas.get(Calendar.DAY_OF_WEEK);
		System.out.println("星期"+weeks[n-1]);
		
	}
	
}
