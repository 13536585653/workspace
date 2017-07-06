package �����ߺ�������;


import java.util.LinkedList;
import java.util.List;


public class Store {
	//�ֿ���
	
	
	private  int max=10;    //�������ֵΪ10��
    private LinkedList<Object>  list=new LinkedList<Object>();    //װ��ͷ���б�
    
    public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
    
    public LinkedList<Object> getList() {
		return list;
	}

	public void setList(LinkedList<Object> list) {
		this.list = list;
	}

	//���ֿ����Ӷ���
    public synchronized  void add(){
    	
    	while(list.size()>=max){
			try {
				this.wait();   
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"������");
    	list.add(new Object());
       	System.out.println("�ֿ��СΪ��"+list.size());
       	this.notifyAll();
	}
    
    //�Ӳֿ��� ,ɾ������
     public  synchronized void del(){
    	 
    	 while(list.size()<=0){
    		 try {
 				this.wait();   
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
     	
    	 }
    	 System.out.println(Thread.currentThread().getName()+"������");
    	 list.remove();
         System.out.println("�ֿ��СΪ��"+list.size());
		 this.notifyAll();
    	}
 }

	
    
	

