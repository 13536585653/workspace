package gather_exhaust;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//�齱
public class Map_Exhaust {
	
	//��ȡ�齱��������
	public static List<Integer> addNum(){
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1000;i<=2000;i++){
			list.add(i);
		}
		return list;
		
	}
	
	//��ʼ�齱�ķ���
	private static String begin(List<Integer> list) {
		int k=1001;
		while(true){
			int index=new Random().nextInt(k);
			int n=list.get(index);
			if(n==1111){
				return "��ϲ��"+(1002-k)+"λ���˹��ڣ����н��ˣ�";
			}else{
				list.remove(index);
				k--;
			}
		}
	}
	
	
	public static void main(String[] args){
	
		//��ȡ�齱����
		List<Integer> list=Map_Exhaust.addNum();
		
		//��ʼ�齱
		String result=Map_Exhaust.begin(list);
		
		//��ʾ�н���
		System.out.println(result);
		
	}
	
}
