package com.xl.designpattern.observer;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 观察者模式：当主题发生改变时，将会向观察者发送消息
 * @version 1.0
 */

public class Test {
	public static void main(String[] args) {
		ObjectFor3D subjectFor3D = new ObjectFor3D();
		
		IObserver observer1 = new Observer1(subjectFor3D);
		IObserver observer2 = new Observer2(subjectFor3D);
		
		subjectFor3D.setMsg("20140420的3D号码是：127" );  
		subjectFor3D.setMsg("20140421的3D号码是：333" );  
	}
}

