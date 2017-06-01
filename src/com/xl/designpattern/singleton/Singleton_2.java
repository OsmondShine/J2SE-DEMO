package com.xl.designpattern.singleton;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 单例模式 饿汉式变换写法[可用]
 * @version 1.0
 */

public class Singleton_2 {
	private static Singleton_2 instance = null;
	
	static{
		instance = new Singleton_2();
	}
	
	private Singleton_2(){};
	
	public static Singleton_2 getInstance(){
		return instance;
	}
}

