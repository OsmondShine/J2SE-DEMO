package com.xl.designpattern.status;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 没钱的状态
 * @version 1.0
 */

public class NoMoneyStatus implements IStatus{
	private VendingMachine machine;
	
	public NoMoneyStatus(VendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("投币成功");
		machine.setStatus(machine.getHasMoneyStatus());
	}

	@Override
	public void backMoney() {
		System.out.println("您没投币，还想退钱?......");
	}

	@Override
	public void turnCrank() {
		System.out.println("您没投币，还想拿东西？......");
	}

	@Override
	public void dispense() {
		throw new IllegalStateException("非法状态！");
	}
}

