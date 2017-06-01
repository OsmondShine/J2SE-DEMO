package com.xl.designpattern.adapter;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 家用220V交流电
 * @version 1.0
 */

public class V220Power {
	public int provideV220Power(){
		System.out.println("我提供220V交流电压。");
		return 220;
	}
}

