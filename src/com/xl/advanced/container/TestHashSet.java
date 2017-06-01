package com.xl.advanced.container;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description 
 * @version 1.0
 */
/*	总结：使用hash算法实现的类：HashMap、Hashtable、hashSet，必须重写hashCode和equals方法才能实现唯一存储
 */
class Student2{
	private int num;
	private String name;
	
	public Student2(){}
	public Student2(int num, String name){
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "学号: " + this.num + ",  姓名: " + name;
	}
	@Override
	public boolean equals(Object obj) {
		Student2 stu = (Student2) obj;
		return this.num == stu.num && this.name.equals(stu.name);
	}
	@Override
	public int hashCode() {
		//return num; //若学号num是唯一的，也可以用num作为哈希码
		return num * this.name.hashCode();
	}
}
public class TestHashSet {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add(new Student2(1001, "张三"));
		c.add(new Student2(1002, "李四"));
		c.add(new Student2(1003, "王五")); 
		c.add(new Student2(1003, "王五"));
		c.add(new Student2(1003, "王五"));
		c.add(new Student2(1003, "王五"));
		c.add(new Student2(1003, "王五")); 
		
		Iterator it = c.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

}

