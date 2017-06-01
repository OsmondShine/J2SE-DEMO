package com.xl.designpattern.status;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 准备出商品的状态，该状态下，不会有任何用户的操作
 * @version 1.0
 */

public class SoldState implements IStatus{
	
	private VendingMachine machine;
	
	public SoldState(VendingMachine machine){
		this.machine = machine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("正在出货，请勿投币");
	}

	@Override
	public void backMoney() {
		System.out.println("正在出货，不退钱!!");
	}

	@Override
	public void turnCrank() {
		System.out.println("正在出货，请勿重复转动手柄");
	}

	@Override
	public void dispense() {
		machine.dispense();
		if (machine.getCount() > 0){
			machine.setStatus(machine.getNoMoneyStatus());
		} else {
			System.out.println("商品已经售罄");
			machine.setStatus(machine.getSoldOutStatus());
		}
	}

}

