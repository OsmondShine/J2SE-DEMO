package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-4
 * @description 
 * @version 1.0
 */

public class EnumTestMain_01 {
	public static void main(String[] args) {
		for (EnumTest et: EnumTest.values()){
			System.out.println(et);
		}
		
		System.out.println("------------我是分割线------------");
		EnumTest et = EnumTest.SUN;
		switch(et){
		case MON:
			System.out.println("今天是星期一");
			break;
		case TUE:
			System.out.println("今天是星期二");
			break;
		case WED:
			System.out.println("今天是星期三");
			break;
		case THU:
			System.out.println("今天是星期四");
			break;
			
		case FRI:
			System.out.println("今天是星期五");
			break;
		case SAT:
			System.out.println("今天是星期六");
			break;
		case SUN:
			System.out.println("今天是星期日");
			break;
		default:
			System.out.println("没有定义！");
			break;
		}
	}

}

