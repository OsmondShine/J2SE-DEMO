package com.xl.designpattern.observer;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 主题接口，所有的主题必须实现此接口
 * @version 1.0
 */

public interface ISubject {
	//注册一个观察者
	public void registerObserver(IObserver observer);
	//移除一个观察者
	public void removeObserver(IObserver observer);
	//通知所有观察者
	public void notifyObserver();
}

