package com.xl.designpattern.abstractfactory;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 具体工厂
 * @version 1.0
 */

public class LowPersonFactory implements IAbstractFactory{

	@Override
	public IVehicle getIVhicle() {
		return new Bike();
	}
}

