package com.xl.designpattern.observer;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 
 * @version 1.0
 */

public class Observer2 implements IObserver{
	private ISubject subject;
	
	public Observer2(ISubject subject){
		this.subject = subject;
		subject.registerObserver(this);
	}
	@Override
	public void update(String msg) {
		System.out.println("Observer2得到3D号码为：" + msg);
	}

}

