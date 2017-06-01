package com.xl.designpattern.adapter_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class TestAdapter {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		V5Power v5Power = new V5PowerAdapter(new V220Power());
		mobile.recharge(v5Power);
	}
}

