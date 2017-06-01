package com.xl.designpattern.abstractfactory;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 
 * @version 1.0
 */

public class TestAbstractFactory {
	public static void main(String[] args) {
		IAbstractFactory factory_1 = new HighPersonFactory();
		System.out.println("HighPerson乘坐的交通工具是：");
		IVehicle vehicle = factory_1.getIVhicle();
		vehicle.gotoWork();
		
		IAbstractFactory factory_2 = new LowPersonFactory();
		System.out.println("LowPerson乘坐的交通工具是：");
		vehicle = factory_2.getIVhicle();
		vehicle.gotoWork();
	}
}

