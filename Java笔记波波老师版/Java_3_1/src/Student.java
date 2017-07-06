
public class Student {
	
	//学生类
	
	//属性
	String  name; 
	int   age;
	double  weight;
	
	//方法
	void study(){
		
		System.out.println(name+"在学习......");
	}
	
    void eat(){
		
		System.out.println(name+"在吃饭......");
	}
	
    //编写toString方法
    public String toString(){
    	return "name:"+name+",weight:"+weight+",age"+age;
    }
	

}
