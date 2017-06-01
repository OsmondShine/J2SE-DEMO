package com.xl.designpattern.decorator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 装饰者模式测试入口
 * @version 1.0
 */

public class TestDecorator{
	public static void main(String[] args) {
		//一个镶嵌2颗红宝石，1颗蓝宝石的靴子
		System.out.println("一个镶嵌2颗红宝石，1颗蓝宝石的靴子");
		IEquip equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
		System.out.println("攻击力： " + equip.caculateAttack());
		System.out.println("描述： " + equip.description());
		System.out.println("------------------------------");
		//一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器
		System.out.println("一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器");
		equip = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmEquip())));
		System.out.println("攻击力： " + equip.caculateAttack());
		System.out.println("描述： " + equip.description());
		System.out.println("------------------------------");
	}

}

