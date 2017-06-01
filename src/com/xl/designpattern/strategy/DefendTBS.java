package com.xl.designpattern.strategy;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-27
 * @description 
 * @version 1.0
 */

public class DefendTBS implements IDefendBehavior{

	@Override
	public void defend() {
		System.out.println("铁布衫");
	}
}

