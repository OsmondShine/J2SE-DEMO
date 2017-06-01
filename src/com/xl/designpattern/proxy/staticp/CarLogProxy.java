package com.xl.designpattern.proxy.staticp;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 
 * @version 1.0
 */

public class CarLogProxy implements Moveable{
	
	private Moveable m;

	public CarLogProxy(Moveable m){
		super();
		this.m = m;
	}
	@Override
	public void move() {
		System.out.println("日志开始。。。。");
		m.move();
		System.out.println("日志结束。。。。");
	}

}

