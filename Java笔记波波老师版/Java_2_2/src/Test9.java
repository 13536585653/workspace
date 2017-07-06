import java.util.Arrays;


public class Test9 {
	
	public static void main(String[] args) {
		
	    //数组排序
		
		int[] a={5,8,7,6,2,3,9};
		
		//原数组输出
		System.out.println("原数组是：");
	    for(int i=0;i<a.length;i++){
	    	
	    	System.out.print(a[i]+"  ");
	    }
	    
	    System.out.println();
	  
//	    //自己排序
//	    int temp;
//	    
//	    for(int i=0;i<a.length-1;i++){
//	    	
//	    	for(int j=i+1;j<a.length;j++){
//	    		
//	    		//交换
//	    		if(a[i]>a[j]){
//	    			temp=a[i];
//	    			a[i]=a[j];
//	    			a[j]=temp;
//	    		}
//	    		
//	    	}
//	    	
//	    }
	    
	    
	    //利用java提供的Arrays类的sort()排序 ,只能进行升序
	      Arrays.sort(a);
	    
	    
	      //排序后的数组输出
	  		System.out.println("排序后数组是：");
	  	    for(int i=0;i<a.length;i++){
	  	    	
	  	    	System.out.print(a[i]+"  ");
	  	    }
	
	}
	

}
