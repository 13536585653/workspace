
public class Student {
	
	//ѧ����
	
	//����
	String  name; 
	int   age;
	double  weight;
	
	//����
	void study(){
		
		System.out.println(name+"��ѧϰ......");
	}
	
    void eat(){
		
		System.out.println(name+"�ڳԷ�......");
	}
	
    //��дtoString����
    public String toString(){
    	return "name:"+name+",weight:"+weight+",age"+age;
    }
	

}
