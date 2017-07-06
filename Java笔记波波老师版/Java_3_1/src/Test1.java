
public class Test1 {
	
	
	//main方法是java程序的入口
	public static void main(String[] args) {
		
		 //通过Student类，去实例化对象
		 Student  student1=new Student();
		 Student   stu2=new Student();
		
		 //为对象的属性赋值
		 student1.name="张三";
		 student1.age=15;
		 student1.weight=55.5;
		 
		 stu2.name="李四";
		 stu2.age=18;
		 stu2.weight=60.5;
		 
		 System.out.println("输出学生1：");
		 System.out.println("姓名:"+student1.name);
		 System.out.println("年龄:"+student1.age);
		 System.out.println("体重:"+student1.weight);
		 
		 System.out.println("输出学生2：");
		 System.out.println("姓名:"+stu2.name);
		 System.out.println("年龄:"+stu2.age);
		 System.out.println("体重:"+stu2.weight);
		 
		 //调用对象的方法
		 student1.study();
		 
		 stu2.eat();
		 
	}

}
