
public class Test1 {
	
	
	//main������java��������
	public static void main(String[] args) {
		
		 //ͨ��Student�࣬ȥʵ��������
		 Student  student1=new Student();
		 Student   stu2=new Student();
		
		 //Ϊ��������Ը�ֵ
		 student1.name="����";
		 student1.age=15;
		 student1.weight=55.5;
		 
		 stu2.name="����";
		 stu2.age=18;
		 stu2.weight=60.5;
		 
		 System.out.println("���ѧ��1��");
		 System.out.println("����:"+student1.name);
		 System.out.println("����:"+student1.age);
		 System.out.println("����:"+student1.weight);
		 
		 System.out.println("���ѧ��2��");
		 System.out.println("����:"+stu2.name);
		 System.out.println("����:"+stu2.age);
		 System.out.println("����:"+stu2.weight);
		 
		 //���ö���ķ���
		 student1.study();
		 
		 stu2.eat();
		 
	}

}
