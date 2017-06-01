package com.xl.designpattern.observer;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 观察者接口，所有的观察者都要实现此接口
 * @version 1.0
 */

public interface IObserver {
	public void update(String msg);
}

