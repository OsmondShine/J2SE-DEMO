package com.xl.advanced.container;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 
 * @version 1.0
 */

public class TestTreeMap {
	public static void main(String[] args) {
		Map m1 = new HashMap();
		Map m2 = new HashMap();
		m1.put("one", 1);
		m1.put("two", 2);
		m1.put("three", 3);
		System.out.println("m1容器内容1->" + m1);
		System.out.println("m1容器大小1->" + m1.size());
		m1.put(66.6, 'm');
		m1.put(123L, 34);
		System.out.println("m1容器内容2->" + m1.size());
		System.out.println("m1容器大小2->" + m1);
		
		System.out.println(m1.containsKey("three"));
		System.out.println(m2.containsValue(34));
		System.out.println(m2.containsValue(123L));
	}
}

