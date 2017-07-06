package org.demo.object;

public class Sub extends Calculator{
	public Bean calculator(Bean b2){
		int numA=b2.getNumA();
		int numB=b2.getNumB();
		b2.setResult(numA-numB);
		return b2;
	}
}
