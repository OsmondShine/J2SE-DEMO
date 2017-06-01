package com.xl.designpattern.singleton;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 内部类[推荐用]
 * @version 1.0	优点：避免了线程不安全，延迟加载，效率高。
 */

public class Singleton_4 {
	private Singleton_4(){}
	
	private static class SingletonHolder{
		private static Singleton_4 instance = new Singleton_4();
	}
	
	public static Singleton_4 getInstance(){
		return SingletonHolder.instance;
	}
}

