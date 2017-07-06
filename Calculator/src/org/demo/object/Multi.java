package org.demo.object;

public class Multi extends Calculator{
	public Bean calculator(Bean b3){
		int numA=b3.getNumA();
		int numB=b3.getNumB();
		b3.setResult(numA*numB);
		return b3;
	}
}
