package com.test.GregorianCalendarTest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {

     
	public static void main(String[] args) {
		
	    //�ʣ������ʥ���������ڼ���
		GregorianCalendar  xmas=new GregorianCalendar(2016,12-1,25);
		String[] weeks={"��","һ","��","��","��","��","��"};
		
		int n=xmas.get(Calendar.DAY_OF_WEEK);
		System.out.println("����"+weeks[n-1]);
		
	}
	
}
