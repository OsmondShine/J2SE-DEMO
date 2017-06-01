package com.xl.designpattern.abstractfactory_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 抽象工厂接口
 * @version 1.0
 */

public interface IAbstractFactory {
	public IVehicle getIVehicle();
	public IBreakfast getIBreakfast();
}

