package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-4
 * @description 
 * @version 1.0
 */

public class EnumTestMain_02 {
	public static void main(String[] args) {
		EnumTest et = EnumTest.WED;
		
		switch(et.compareTo(EnumTest.SUN)){
		case -4:
			System.out.println("WED在SUN之前");
			break;
		case 4:
			System.out.println("WED在SUN之后");
			break;
		default:
			System.out.println("在同一位置");
			break;
		}
		
		System.out.println("getDeclaringClass():	" + et.getDeclaringClass().getName());
		System.out.println("name():	" + et.name());
		
		System.out.println("toString():	" + et.toString());
		//返回枚举常量的顺序值，从0开始
		System.out.println("ordinal():	" + et.ordinal());
	}

}

