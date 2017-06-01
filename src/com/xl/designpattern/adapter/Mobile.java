package com.xl.designpattern.adapter;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 手机
 * @version 1.0
 */

public class Mobile {
	//充电
	public void recharge(IV5Power power){
		int provideV5Power = power.provideV5Power();
		System.out.println("手机（客户端）:我要5V电压充电，现在是--->" + provideV5Power + "V");
	}
}

