package com.test.exceptionTest;

public class Test4 {
	
	public static void main(String[] args) {
		
		try {
			f();   //����ʱ�����벶��
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//����һ������Ϊ�׳��쳣�ķ�����
	public static void  f() throws Exception{
		
		throw new Exception("�Լ��������쳣....");
	
	}

}
