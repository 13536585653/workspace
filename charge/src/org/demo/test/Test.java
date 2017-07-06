package org.demo.test;

import org.demo.entity.ChargeBean;
import org.demo.implementation.RebateCharge;
import org.demo.interfaces.ChargeInterfates;

public class Test {
	public static void main(String[] args) {
		//创建一个收费信息对象，包含要计算的 收费信息
		ChargeBean bean = new ChargeBean();
		bean.setPrice(2);
		bean.setNum(4);
		bean.setRebate(0.5);
		//创建具体的收费策略和算法
		ChargeInterfates ci= (ChargeInterfates) new RebateCharge();	
		ChargeBean b1=ci.charge(bean);
		System.out.println(b1.getResult());
	}
}
