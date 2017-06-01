package com.xl.designpattern.abstractfactory_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 
 * @version 1.0
 */

public class HighPersonFactory implements IAbstractFactory{

	@Override
	public IVehicle getIVehicle() {
		return new Bus();
	}

	@Override
	public IBreakfast getIBreakfast() {
		return new Milk();
	}

}

