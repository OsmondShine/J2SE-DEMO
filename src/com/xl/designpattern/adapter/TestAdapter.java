package com.xl.designpattern.adapter;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 适配器模式测试入口
 * @version 1.0
 */

public class TestAdapter {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		IV5Power v5Power = new V5PowerAdapter(new V220Power());
		mobile.recharge(v5Power);
	}
}

