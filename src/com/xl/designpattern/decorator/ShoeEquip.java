package com.xl.designpattern.decorator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 鞋子
 * @version 1.0
 */

public class ShoeEquip implements IEquip{

	@Override
	public int caculateAttack() {
		return 5;
	}

	@Override
	public String description() {
		return "圣战靴子";
	}
}

