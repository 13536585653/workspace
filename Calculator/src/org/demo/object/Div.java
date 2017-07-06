package org.demo.object;

public class Div extends Calculator{
	public Bean calculator (Bean b4){
		int numA=b4.getNumA();
		int numB=b4.getNumB();
		b4.setResult(numA/numB);
		return b4;
	}
}
