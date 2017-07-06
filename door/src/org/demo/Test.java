package org.demo;

public class Test {
	public static void main(String args[]){
		Door d=new Security_Door();
		d.Open();
		System.out.println();
		d.Close();
		System.out.println();
		
		
		//将门的开、关功能强转为报警功能
		AlarmInterface a=(AlarmInterface)d;
		a.Alarm();
	}
}
