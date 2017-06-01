package com.xl.designpattern.proxy.simulate;

import java.lang.reflect.Method;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 
 * @version 1.0
 */

public class TimeHandler implements InvocationHandler{
	
	private Object target;
	
	public TimeHandler() {}
	public TimeHandler(Object target){
		super();
		this.target = target;
	}
	
	@Override
	public void invoke(Object obj, Method m) {
		try {
			long startTime = System.currentTimeMillis();
			System.out.println("汽车开始行驶.....");
			m.invoke(target);
			long endTime = System.currentTimeMillis();
			System.out.println("汽车结束行驶.... 行驶时间：" + (endTime - startTime) + "毫秒！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

