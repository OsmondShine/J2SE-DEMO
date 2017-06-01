package com.xl.designpattern.adapter_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class V5PowerAdapter implements V5Power{
	
	private V220Power v220Power;
	
	public V5PowerAdapter(V220Power v220Power){
		this.v220Power = v220Power;
	}
	
	@Override
	public int provideV5Power() {
		v220Power.provideV220Power();
		System.out.println("适配器：我悄悄的将220V电压改变成5V电压");
		return 5;
	}

}

