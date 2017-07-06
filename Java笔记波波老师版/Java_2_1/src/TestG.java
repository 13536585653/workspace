import java.util.Scanner;


public class TestG {
	
	public static void main(String[] args) {
		
		int n;  //数量
		double price;  //单价
		char vip;   //是否会员 y/n
		
		double sum;  //合计
		double zk;   //折扣
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入商品单价:");
		price=input.nextDouble();
		System.out.print("请输入商品数量:");
		n=input.nextInt();
		
		System.out.print("是否会员？y/n:");
		vip=input.next().charAt(0);
		
		if(vip=='y'){
			zk=0.9;   //打9折
		}else{
			zk=1;     //不打折
		}
		
		sum=n*price;   //计算合计
		
		int m=0;  //减免金额
		
		m=(int)sum/1000*100;  //计算减免
		
		System.out.println("应付金额为:"+sum);
		System.out.println("减免为:"+m);
		System.out.println("会员折扣为:"+(sum-m)*(1-zk));
		System.out.println("实付金额为:"+(sum-m)*zk);
	}

}
