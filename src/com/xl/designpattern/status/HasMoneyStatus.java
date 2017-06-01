package com.xl.designpattern.status;

import java.util.Random;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 已投钱状态
 * @version 1.0
 */

public class HasMoneyStatus implements IStatus{
	
	private VendingMachine machine;
	private Random random = new Random();
	
	public HasMoneyStatus(VendingMachine machine){
		this.machine = machine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("您已经投过币了，不能再投了呦....");
	}

	@Override
	public void backMoney() {
		System.out.println("退币成功");
		machine.setStatus(machine.getNoMoneyStatus());
	}
	
	/*	当用户投币之后,有一定几率中奖。
	 *  中奖原理为：使用random随机函数生成[0,10)区间的伪随机数,当随机数的值为0时，即为中奖状态。
	 * 
	 */
	@Override
	public void turnCrank() {
		System.out.println("您转动了手柄");
		int winner = random.nextInt(10);
		if (winner == 0 && machine.getCount() > 1){
			machine.setStatus(machine.getWinnerStatus());
		} else{
			machine.setStatus(machine.getSoldStatus());
		}
	}

	@Override
	public void dispense() {
		throw new IllegalStateException("非法状态！");
	}
}

