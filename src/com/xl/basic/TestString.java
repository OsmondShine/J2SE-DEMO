package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-2
 * @description 
 * @version 1.0
 */
/*	总结 :
 * 		String的内容是只读的/从不改变的(被final修饰)，每当我们看到那些看似会改变String对象(例如：+=)的操作时，实际上只是获得了新的String只读对象而已，
 * 		而原有的String对象并未改变。
 * 
 * */
public class TestString {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	public static void main(String[] args) {
		String myName = "Petronius";
		String occupation = "Reorganization Specialist";
		
		myName +=" Arbiter";
		myName += " ";
		myName += "("+occupation+")";
		System.out.println("Name = " + myName);
	}

}

