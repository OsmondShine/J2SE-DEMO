package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-5
 * @description 
 * @version 1.0
 */

public class MethodInvocationTest {
	void m(String key, Object val){
		System.out.println("参数类型String Object 方法被调用！");
	}
	<S, T extends Number> void m(S key, T val){
		System.out.println("参数 类型S T 方法被调用");
	}

}

