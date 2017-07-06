package 生产者和消费者;


import java.util.LinkedList;
import java.util.List;


public class Store {
	//仓库类
	
	
	private  int max=10;    //设置最大值为10；
    private LinkedList<Object>  list=new LinkedList<Object>();    //装馒头的列表
    
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

	//往仓库里，添加东西
    public synchronized  void add(){
    	
    	while(list.size()>=max){
			try {
				this.wait();   
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"生产了");
    	list.add(new Object());
       	System.out.println("仓库大小为："+list.size());
       	this.notifyAll();
	}
    
    //从仓库里 ,删除东西
     public  synchronized void del(){
    	 
    	 while(list.size()<=0){
    		 try {
 				this.wait();   
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
     	
    	 }
    	 System.out.println(Thread.currentThread().getName()+"消费了");
    	 list.remove();
         System.out.println("仓库大小为："+list.size());
		 this.notifyAll();
    	}
 }

	
    
	

