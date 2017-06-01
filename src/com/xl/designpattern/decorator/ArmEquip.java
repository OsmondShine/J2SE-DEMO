package com.xl.designpattern.decorator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 武器
 * @version 1.0
 */

public class ArmEquip implements IEquip{

	@Override
	public int caculateAttack() {
		return 20;
	}

	@Override
	public String description() {
		return "屠龙刀";
	}
}

