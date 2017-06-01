package com.xl.designpattern.singleton;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 单例模式	懒汉式双重校验锁[推荐用]
 * @version 1.0	优点：线程安全；延迟加载；效率较高。
 */

public class Singleton_3 {
	//懒汉式变种，属于懒汉式中最好的写法，保证了：延迟加载和线程安全
	private static Singleton_3 instance = null;
	
	private Singleton_3(){}
	
	public static Singleton_3 getInstance(){
		if (instance == null){
			synchronized (Singleton_3.class) {
				if (instance == null){
					instance = new Singleton_3();
				}
			}
		}
		return instance;
	}
}

