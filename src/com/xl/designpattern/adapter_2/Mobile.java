package com.xl.designpattern.adapter_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class Mobile {
	public void recharge(V5Power v5Power){
		int providePower = v5Power.provideV5Power();
		System.out.println("手机：我需要5V电压充电，现在是" + providePower + "V");
	}
}

