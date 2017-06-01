package com.xl.designpattern.proxy.dynamicp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 
 * @version 1.0
 */

public class TimeHandler implements InvocationHandler{
	
	private Object target;
	
	public TimeHandler(){}
	public TimeHandler(Object target){
		super();
		this.target = target;
	}
	
	/*	参数:
	 * 		proxy：被代理对象
	 * 		method:被代理对象的方法
	 * 		args:方法的参数
	 */
	@Override
	public Object invoke(Object obj, Method method, Object[] aobj)
			throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。。");
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶。。。。");
		System.out.println("汽车行驶时间：  " + (endTime - startTime) + "毫秒！");
		return null;
	}

}

