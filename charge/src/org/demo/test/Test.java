package org.demo.test;

import org.demo.entity.ChargeBean;
import org.demo.implementation.RebateCharge;
import org.demo.interfaces.ChargeInterfates;

public class Test {
	public static void main(String[] args) {
		//����һ���շ���Ϣ���󣬰���Ҫ����� �շ���Ϣ
		ChargeBean bean = new ChargeBean();
		bean.setPrice(2);
		bean.setNum(4);
		bean.setRebate(0.5);
		//����������շѲ��Ժ��㷨
		ChargeInterfates ci= (ChargeInterfates) new RebateCharge();	
		ChargeBean b1=ci.charge(bean);
		System.out.println(b1.getResult());
	}
}
