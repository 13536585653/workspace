package com.test.RegexTest;

public class Test3 {

	
	public static void main(String[] args) {
		
		//���ȫ���������ҳ���
		String s="����,����:����;����        ����";
		
		String[] names=s.split("(,|:|;|\\s+)");  //ʹ�÷ָ�������ʽ ���ַ����ָ������
		
		for(int i=0;i<names.length;i++){    //ѭ���������
			System.out.println(names[i]);
		}
		
		
	}
}
