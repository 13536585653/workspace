package org.demo;

public class Test {
	public static void main(String args[]){
		Door d=new Security_Door();
		d.Open();
		System.out.println();
		d.Close();
		System.out.println();
		
		
		//���ŵĿ����ع���ǿתΪ��������
		AlarmInterface a=(AlarmInterface)d;
		a.Alarm();
	}
}
