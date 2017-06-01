package com.xl.designpattern.status;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 
 * @version 1.0
 */

public class TestStatus {
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine(1000);
		machine.insertMoney();
		machine.insertMoney();
		machine.backMoney();
		machine.backMoney();
		
		System.out.println("----------我要中奖----------");
		
		for (int i = 0; i < 1000; i++){
			machine.insertMoney();
			machine.turnkCrank();
		}
		
		System.out.println("----------压力测试------------");
		machine.insertMoney();
		machine.backMoney();
		machine.backMoney();
		machine.turnkCrank();
		machine.turnkCrank();
		machine.backMoney();
	}
}

