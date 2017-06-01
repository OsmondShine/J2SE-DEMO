package com.xl.advanced.container;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 使用TreeSet存储对象
 * @version 1.0
 */
/*		总结：
 * 			使用TreeSet存储对象时，该对象的类必须实现Comparable接口
 */
public class TestTreeSet {
	public static void main(String[] args) {
		Collection c = new TreeSet();
		
		c.add(new Student3(1006, "张三"));
		c.add(new Student3(1003, "小娟")); //16行
		c.add(new Student3(1003, "小娟"));
		c.add(new Student3(1002, "李四"));
		c.add(new Student3(1008, "王刚")); //16行
		c.add(new Student3(1001, "王五")); //16行
		
		Iterator it = c.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}

class Student3 implements Comparable{
	
	private final int num;
	private String name;
	
	public Student3(int num, String name) {
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "学号: " + this.num + ",  姓名: " + name;
	}
/*	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj instanceof Student3){
			if (this.num == ((Student3)obj).num){
				flag = true;
			}
		}
		return flag;
	}*/
	@Override
	public int compareTo(Object o) {
		return this.num - ((Student3)o).num;
	}
}