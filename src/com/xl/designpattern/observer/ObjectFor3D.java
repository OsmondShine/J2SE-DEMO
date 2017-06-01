package com.xl.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 
 * @version 1.0
 */

public class ObjectFor3D implements ISubject{
	private List<IObserver> observers = new ArrayList<IObserver>();
	//3D彩票的号码
	private String msg;
	
	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		int index = observers.indexOf(observer);
		if (index >= 0){
			observers.remove(index);
		}
	}
	
	@Override
	public void notifyObserver() {
		for (IObserver observer: observers){
			observer.update(msg);
		}
	}
	
	//主题更新消息
	public void setMsg(String msg) {
		this.msg = msg;
		notifyObserver();
	}
}

