package com.xl.designpattern.decorator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 黄宝石装饰品
 * @version 1.0
 */

public class YellowGemDecorator implements IEquipDecorator{

	//每个装饰品维护一个装备
	private IEquip equip;
	
	public YellowGemDecorator(IEquip equip){
		this.equip = equip;
	}
	
	@Override
	public int caculateAttack() {
		return 10 + equip.caculateAttack();
	}

	@Override
	public String description() {
		return equip.description() + "+ 黄宝石";
	}
}

