package com.xl.designpattern.strategy;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-27
 * @description 
 * @version 1.0
 */

public class AttackJY implements IAttackBehavior{

	@Override
	public void attack() {
		System.out.println("九阳神功");
	}
}

