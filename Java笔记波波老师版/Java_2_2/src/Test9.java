import java.util.Arrays;


public class Test9 {
	
	public static void main(String[] args) {
		
	    //��������
		
		int[] a={5,8,7,6,2,3,9};
		
		//ԭ�������
		System.out.println("ԭ�����ǣ�");
	    for(int i=0;i<a.length;i++){
	    	
	    	System.out.print(a[i]+"  ");
	    }
	    
	    System.out.println();
	  
//	    //�Լ�����
//	    int temp;
//	    
//	    for(int i=0;i<a.length-1;i++){
//	    	
//	    	for(int j=i+1;j<a.length;j++){
//	    		
//	    		//����
//	    		if(a[i]>a[j]){
//	    			temp=a[i];
//	    			a[i]=a[j];
//	    			a[j]=temp;
//	    		}
//	    		
//	    	}
//	    	
//	    }
	    
	    
	    //����java�ṩ��Arrays���sort()���� ,ֻ�ܽ�������
	      Arrays.sort(a);
	    
	    
	      //�������������
	  		System.out.println("����������ǣ�");
	  	    for(int i=0;i<a.length;i++){
	  	    	
	  	    	System.out.print(a[i]+"  ");
	  	    }
	
	}
	

}
