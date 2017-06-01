package com.xl.designpattern.singleton;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 枚举方式实现单例模式[极推荐使用]	适用于JDK1.5后
 * @version 1.0	
 */

public enum SingletonEnum {
	instance;
	
	private SingletonEnum(){}
	
	public void method(){
		System.out.println("创建了一个实例" + instance);
	}
}

