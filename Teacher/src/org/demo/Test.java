package org.demo;

public class Test {
	public static void main(String args[]){
		//������ΪTeacher�ǳ����࣬����һ������ʹ��new�ؼ���
		//Teacher t1=new Teacher();
		Teacher t=new NetTeacher();
		t.lesson();
		t.Call();
		
		//��tǿתΪ�ӿ�����
		Interface i=(Interface)t;
		i.Develop();
	}

	
}
