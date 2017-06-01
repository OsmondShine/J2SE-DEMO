package com.xl.designpattern.singleton;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-14
 * @description 单例模式 饿汉式[可用]
 * @version 1.0
 */

public class Singleton_1 {
	private static final Singleton_1 singleton = new Singleton_1();
	//构造函数私有化
	private Singleton_1(){}
	
	public static Singleton_1 getInstance(){
		return singleton;
	}
}

