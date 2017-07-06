package org.demo.object;

public class Add extends Calculator{
	public Bean calculator(Bean b1){
		int numA=b1.getNumA();
		int numB=b1.getNumB();
		b1.setResult(numA+numB);
		return b1;
	}
}
