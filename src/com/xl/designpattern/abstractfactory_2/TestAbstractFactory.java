package com.xl.designpattern.abstractfactory_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 
 * @version 1.0
 */

public class TestAbstractFactory {
	public static void main(String[] args) {
		IAbstractFactory factory = new LowPersonFactory();
		IVehicle vehicle = factory.getIVehicle();
		IBreakfast breakfast = factory.getIBreakfast();
		System.out.println("吃的早饭是：");
		breakfast.eat();
		System.out.println("上班交通工具是：");
		vehicle.gotoWork();
		
		IAbstractFactory factory2 = new LowPersonFactory();
		vehicle = factory2.getIVehicle();
		breakfast = factory2.getIBreakfast();
		System.out.println("吃的早饭是：");
		breakfast.eat();
		System.out.println("上班交通工具是：");
		vehicle.gotoWork();
	}
}

