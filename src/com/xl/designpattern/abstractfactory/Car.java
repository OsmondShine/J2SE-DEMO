package com.xl.designpattern.abstractfactory;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 具体产品
 * @version 1.0
 */

public class Car implements IVehicle{

	@Override
	public void gotoWork() {
		System.out.println("开车上班！");
	}

}

