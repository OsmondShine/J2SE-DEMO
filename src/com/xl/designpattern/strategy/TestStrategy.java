package com.xl.designpattern.strategy;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-27
 * @description 
 * @version 1.0
 */

public class TestStrategy {
	public static void main(String[] args) {
		Role roleA = new RoleA("A");
		
		roleA.setAttackBehavior(new AttackJY())
			 .setDefendBehavior(new DefendTBS())
			 .setRunBehavior(new RunJCTQ());
		
		System.out.println(roleA.name + ":");
		roleA.run();
		roleA.attack();
		roleA.defend();
	}
}

