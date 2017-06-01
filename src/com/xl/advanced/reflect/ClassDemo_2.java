package com.xl.advanced.reflect;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 
 * @version 1.0
 */

public class ClassDemo_2 {
	public static void main(String[] args) {
		Class c1 = int.class;
		Class c2 = String.class;
		Class c3 = double.class;
		Class c4 = Double.class;
		Class c5 = void.class;
		
		System.out.println(c1.getName());
	}
}

