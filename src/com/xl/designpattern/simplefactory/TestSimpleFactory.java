package com.xl.designpattern.simplefactory;


/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 使用SimpleFactory，当类型不存在时，会报空指针；而SimpleFactory_2，不存在该问题
 * @version 1.0
 */

public class TestSimpleFactory {
	public static void main(String[] args) {
//		SimpleFactory.produceHuman("man").say();
//		SimpleFactory.produceHuman("woman").say();
//		SimpleFactory.produceHuman("woman1").say();
		
		IHuman human = SimpleFactory_2.produceHuman(Man.class);
		human.say();
		
		IHuman human1 = SimpleFactory_2.produceHuman(Woman.class);
		human1.say();
	}
	
}

