package com.xl.designpattern.proxy.staticp;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 静态代理模式测试类
 * @version 1.0
 */

public class TestStaticProxy {
	public static void main(String[] args) {
		Car car = new Car();
		CarLogProxy clp = new CarLogProxy(car);
		CarTimeProxy ctp = new CarTimeProxy(clp);
		ctp.move();
	}
}

