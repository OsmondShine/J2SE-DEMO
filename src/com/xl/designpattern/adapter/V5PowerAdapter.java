package com.xl.designpattern.adapter;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 将220V转为5V的手机适配器
 * @version 1.0
 */

public class V5PowerAdapter implements IV5Power{
	//组合方式
	private V220Power v220Power;
	
	public V5PowerAdapter(V220Power v220Power) {
		this.v220Power = v220Power;
	}

	@Override
	public int provideV5Power() {
		v220Power.provideV220Power();
		//power经过各种操作--->5
		System.out.println("适配器：我悄悄的适配了电压");
		return 5;
	}

}

