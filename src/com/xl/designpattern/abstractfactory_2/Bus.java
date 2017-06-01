package com.xl.designpattern.abstractfactory_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 
 * @version 1.0
 */

public class Bus implements IVehicle{
	@Override
	public void gotoWork() {
		System.out.println("坐公交车上班！");
	}
}

