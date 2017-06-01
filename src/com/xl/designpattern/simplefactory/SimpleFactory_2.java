package com.xl.designpattern.simplefactory;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 使用反射为简单工厂创建对象
 * @version 1.0
 */

public class SimpleFactory_2 {
	public static IHuman produceHuman(Class c){
		IHuman human = null;
		try {
			human = (IHuman)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			System.out.println("不支持抽象类或接口");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("非法访问，即不能访问私有成员");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("类不存在");
			e.printStackTrace();
		}
		return human;
	}
}

