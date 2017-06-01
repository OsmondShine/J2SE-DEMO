package com.xl.designpattern.status;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 自动售货机
 * @version 1.0
 */

public class VendingMachine_0 {
	//已投币
	private final static int HAS_MONEY = 0;
	//未投币
	private final static int NO_MONEY = 1;
	//售出商品
	private final static int SOLD = 2;
	//商品售罄
	private final static int SOLD_OUT = 3;
	
	private int currentStatus = NO_MONEY;
	//商品数量
	private int count = 0;
	
	public VendingMachine_0(int count){
		this.count = count;
	}
	
	//投入硬币，任何状态用户都可能投币（部分不存在情况已经去除）
	public void insertMoney(){
		switch (currentStatus){
			case NO_MONEY:
				currentStatus = HAS_MONEY;
				System.out.println("成功投入硬币");
				break;
			case HAS_MONEY:
				System.out.println("已经有硬币，无需投币");
				break;
			case SOLD_OUT:
				System.out.println("商品已售罄,请勿投币");
				break;
		}
	}
	
	//退币，任何状态下用户都可能退币（部分不存在情况已经去除）
	public void backMoney(){
		switch (currentStatus){
			case NO_MONEY:
				System.out.println("您未投入硬币");
				break;
			case HAS_MONEY:
				System.out.println("退币成功");
				currentStatus = NO_MONEY;
				break;
			case SOLD_OUT:
				System.out.println("您未投币....");
				break;
		}
	}
	
	//转动手柄购买,任何状态下用户都有可能转动手柄（程序逻辑下，部分不存在情况已经去除）
	public void turnCrank(){
		switch (currentStatus) {
			case NO_MONEY:
				System.out.println("请先投入硬币");
				break;
			case HAS_MONEY:
				System.out.println("正在出商品...");
				currentStatus = SOLD;
				dispense();
				break;
			case SOLD_OUT:
				System.out.println("商品已经售罄");
				break;
		}
	}

	//发放商品
	private void dispense() {
		switch (currentStatus) {
			case SOLD:
				count --;
				System.out.println("发出商品.....");
				if (count == 0){
					System.out.println("商品售罄");
					currentStatus = SOLD_OUT;
				} else {
					currentStatus = NO_MONEY;
				}
				break;
		}
	}
}

