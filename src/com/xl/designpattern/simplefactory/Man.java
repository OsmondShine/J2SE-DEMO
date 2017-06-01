package com.xl.designpattern.simplefactory;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 
 * @version 1.0
 */

public class Man implements IHuman{

	@Override
	public void say() {
		System.out.println("我是男人！");
	}
}

