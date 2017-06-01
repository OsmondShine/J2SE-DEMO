package com.xl.basic;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-4
 * @description 
 * @version 1.0
 */
/*
 * 可以将enum看成一个普通的类，可以添加属性和方法，
 * 所不同的是enum不可以再继承其它类，因为enum已经继承了java.lang.Enum(java是单一继承)
 * */ 
public class EnumSetAndEnumMapTest {
	public static void main(String[] args) {
		//EnumSet的使用
		EnumSet<EnumTest> weekSet = EnumSet.allOf(EnumTest.class);		for (EnumTest day : weekSet){
			System.out.println(day);
		}
		
		//EnumMap的使用
		EnumMap<EnumTest, String> weekMap = new EnumMap<EnumTest, String>(EnumTest.class);
		weekMap.put(EnumTest.MON, "星期一");
		weekMap.put(EnumTest.TUE, "星期二");
		
		for (Iterator<java.util.Map.Entry<EnumTest, String>> iter = weekMap.entrySet().iterator(); iter.hasNext();){
			java.util.Map.Entry<EnumTest, String> entry = iter.next();
			System.out.println(entry.getKey().name() + ":" + entry.getValue());
		}
		
		System.out.println("--------我是分割线--------");
		System.out.println(Long.decode("0XABCD"));
	}
}

