package com.test.SimpleDateFormatTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class Test {

	  public static void main(String[] args) {
		
		   /*
		    * 
		    * ����ǰ���ڣ��� 2016-1-1 02:02:05 ��ʽ���
		    *  �� 2016��1��1�� 12�� 02�� 05�� ���
		    */
		  
		  Date  date=new Date();
		  
		  SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  String s1=sdf1.format(date);  //�����ڸ�ʽ�����ַ���
		  
		  SimpleDateFormat sdf2=new SimpleDateFormat("yyyy��MM��dd�� HH�� mm��ss�� ");
		  String s2=sdf2.format(date);
		  
		  System.out.println(date);
		  System.out.println(s1);
		  System.out.println(s2);
		  
		  
		  
	}
}
