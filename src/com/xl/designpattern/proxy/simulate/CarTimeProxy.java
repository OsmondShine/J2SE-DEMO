package com.xl.designpattern.proxy.simulate;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 
 * @version 1.0
 */

public class CarTimeProxy implements Moveable{

	private Moveable m;
	
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶....");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶....  汽车行驶时间：" 
				+ (endtime - starttime) + "毫秒！");
	}
}

