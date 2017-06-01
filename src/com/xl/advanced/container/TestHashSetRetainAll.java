package com.xl.advanced.container;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 使用HashSet中的retainAll()方法，求两集合间交集
 * @version 1.0
 */
/*	总结：如s1.retainAll(s2)，即为求s1与s2间的交集，交集存储在s1中，s2不变；
 * 		 若s1不需要改变，则s1.retainAll(s2)返回值为假（也即s1与s2全等时）,否则为真
 * 
 * 
 */
public class TestHashSetRetainAll {
	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		
		Set s2 = new HashSet();
		s2.add("c");
		s2.add("a");
		s2.add("b");
		
		System.out.println("s1.retainAll(s2) = " + s1.retainAll(s2));
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		Set s3 = new HashSet();
		s3.add("f");
		Set s4 = new HashSet();
		s4.add("n");
		System.out.println("s3.retainAll(s4) = " + s3.retainAll(s4));
		System.out.println("s3 = " + s3);
		System.out.println("s4  = " + s4);
	}
}

