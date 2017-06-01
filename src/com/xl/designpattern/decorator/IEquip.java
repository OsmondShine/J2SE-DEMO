package com.xl.designpattern.decorator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 装备接口
 * @version 1.0
 */

public interface IEquip {
	//计算攻击力
	public int caculateAttack();
	//装备描述
	public String description();
}

