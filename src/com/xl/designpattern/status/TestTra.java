package com.xl.designpattern.status;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 
 * @version 1.0
 */

public class TestTra {
	public static void main(String[] args) {
		VendingMachine_0 machine = new VendingMachine_0(10);
		machine.insertMoney();
		machine.backMoney();
		machine.turnCrank();
		
		System.out.println("-----------------------------------");
		
		machine.insertMoney();
		machine.turnCrank();
		
		System.out.println("---------------压力测试---------------");
		machine.insertMoney();
		machine.insertMoney();
		machine.turnCrank();
		machine.turnCrank();
		machine.backMoney();
		machine.turnCrank();
	}
}

