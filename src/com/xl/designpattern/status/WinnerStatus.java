package com.xl.designpattern.status;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 中奖状态，该状态下不会有任何的用户操作
 * @version 1.0
 */

public class WinnerStatus implements IStatus{

	private VendingMachine machine;
	
	public WinnerStatus(VendingMachine machine){
		this.machine = machine;
	}
	
	@Override
	public void insertMoney() {
		throw new IllegalStateException("非法状态");
	}

	@Override
	public void backMoney() {
		throw new IllegalStateException("非法状态");
	}

	@Override
	public void turnCrank() {
		throw new IllegalStateException("非法状态");
	}

	@Override
	public void dispense() {
		System.out.println("您中奖了，恭喜您，您将得到2件商品");
		machine.dispense();
		
		if (machine.getCount() == 0){
			System.out.println("商品已售罄");
			machine.setStatus(machine.getSoldOutStatus());
		} else {
			machine.dispense();
			if (machine.getCount() > 0){
				machine.setStatus(machine.getNoMoneyStatus());
			} else {
				System.out.println("商品已经售罄");
				machine.setStatus(machine.getSoldOutStatus());
			}
		}
	}
}

