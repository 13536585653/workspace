package org.demo.implementation;

import org.demo.entity.ChargeBean;
import org.demo.interfaces.ChargeInterfates;

public class ReturnCharge implements ChargeInterfates{

	@Override
	public ChargeBean charge(ChargeBean bean) {
		System.out.println("·µÀûËã·¨");
		return null;
	}
	
}
