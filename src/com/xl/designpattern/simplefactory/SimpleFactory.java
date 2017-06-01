package com.xl.designpattern.simplefactory;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 
 * @version 1.0
 */

public class SimpleFactory {
	public static IHuman produceHuman(String type){
		if ("man".equals(type)){
			return new Man();
		}else if ("woman".equals(type)){
			return new Woman();
		}
		System.out.println("没有指定的类型！");
		return null;
	}
}

