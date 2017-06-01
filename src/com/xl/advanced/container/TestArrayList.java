package com.xl.advanced.container;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description 测试ArrayList中的add(),size(),System.out.println(Collection对象)的用法
 * @version 1.0
 */
/*	总结：
 *		Collection可以装入不同类型的对象，若是基本数据类型，则编译器会将其包装成对应的对象类型 		
 * 
 */

class Name{
	private String firstName;
	private String lastName;

	public Name() {}
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "名：" + lastName + " 	姓：" + firstName;
	}
}
public class TestArrayList {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add("嘿嘿嘿");
		c.add(new Name("Xie", "Liang"));
		
		c.add(200);
		
		System.out.println(c.size());
		System.out.println(c);	//相当于c.toString，其功能是：返回这样一个String对象：[调用第一个元素的toString方法输出，调用第二个元素的toString方法输出，...............]
		
		System.out.println("同志们，掩护首长撤退！");
	}

}
/*4
[hello, 嘿嘿嘿, 名：Liang,	姓：Xie, 200]
同志们，掩护首长撤退！
*/