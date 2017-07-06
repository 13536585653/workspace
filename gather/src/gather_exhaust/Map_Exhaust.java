package gather_exhaust;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//抽奖
public class Map_Exhaust {
	
	//获取抽奖基数方法
	public static List<Integer> addNum(){
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1000;i<=2000;i++){
			list.add(i);
		}
		return list;
		
	}
	
	//开始抽奖的方法
	private static String begin(List<Integer> list) {
		int k=1001;
		while(true){
			int index=new Random().nextInt(k);
			int n=list.get(index);
			if(n==1111){
				return "恭喜第"+(1002-k)+"位幸运观众，你中奖了！";
			}else{
				list.remove(index);
				k--;
			}
		}
	}
	
	
	public static void main(String[] args){
	
		//获取抽奖基数
		List<Integer> list=Map_Exhaust.addNum();
		
		//开始抽奖
		String result=Map_Exhaust.begin(list);
		
		//显示中奖者
		System.out.println(result);
		
	}
	
}
