package org.demo.implementation;

import org.demo.entity.ChargeBean;


//�������㷨
public class NormalCharge {
	public ChargeBean charge(ChargeBean bean){
		double result=bean.getPrice()*bean.getNum();
		bean.setResult(result);
		return bean;}
}
