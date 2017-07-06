package org.demo.implementation;

import org.demo.entity.ChargeBean;
import org.demo.interfaces.ChargeInterfates;

public class RebateCharge implements ChargeInterfates{
	public ChargeBean charge(ChargeBean bean){
		double result=bean.getPrice()*bean.getNum()*bean.getRebate();
		bean.setResult(result);
		return bean;
	}
}
