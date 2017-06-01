package com.xl.advanced.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 
 * @version 1.0
 */

public class MethodDemo_4 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("你好");
//		list2.add(200);	//错误的
		
		Class c1 = list1.getClass();
		Class c2 = list2.getClass();
		System.out.println(c1 == c2);
		//反射的操操作都是编译之后的操作
		/*
		 * c1 == c2结果返回true说明编译之后集合的泛型是去泛型化的
		 * JAVA中集合的泛型，是防止错误输入的，只在编译阶段有效，绕过编译就无效了
		 * 验证：我们可以通过方法的反射来操作，绕过编译
		 */	
		try {
			Method m2 = c2.getMethod("add", Object.class);
			m2.invoke(list2, 200);	//绕过编译操作就绕过了泛型
			System.out.println(list2.size());
			System.out.println(list2);
		/*	for (String str: list2){
				System.out.println(str);
			}*/	//不能这样遍历
		/*	for (Object obj : list2) {
				System.out.println(obj);
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

