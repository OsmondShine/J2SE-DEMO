package com.xl.designpattern.proxy.simulate;


/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 模拟动态代理实现测试类
 * @version 1.0
 */

public class Client {
	/*测试类
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class, h);
		m.move();
	}
}

