package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-14
 * @description 
 * @version 1.0
 */

public class TestMain extends Throwable{
	public static void main(String[] args) {
		MethodInvocationTest mit = new MethodInvocationTest();
		mit.m("hello", (Object)Integer.valueOf(20));
	}
}

