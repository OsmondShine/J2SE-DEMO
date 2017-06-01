package com.xl.advanced.container;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 添加泛型的HashMap
 * @version 1.0
 */

public class GenericOnTestHashMap {
	public static void main(String[] args) {
		HashMap<Integer, Student4> hm = new HashMap<Integer, Student4>();
		
		hm.put(1001, new Student4(1001, "zhangsan", 20));
		hm.put(1003, new Student4(1003, "lisi", 30));
		hm.put(1004, new Student4(1004, "wangwu", 10));
		hm.put(1002, new Student4(1002, "baichi", 20));
		
		//遍历所有元素
		System.out.println("hm容器中的所有元素是：");
		Set<Integer> s = hm.keySet();
		Iterator<Integer> it = s.iterator();
		while (it.hasNext()){
			int key = (Integer)it.next();
			System.out.println("key:" + key);
			System.out.println(hm.get(key));
		}
		System.out.println("直接查找某一元素：");
		System.out.println(hm.get(1003));
		System.out.println(hm.get(1005));
	}
}
class Student4{
	private int id;
	private String name;
	private int age;
	
	public Student4(){}
	public Student4(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode()*id*age;
	}
	@Override
	public boolean equals(Object obj) {
		Student4 stu = (Student4)obj;
		return this.id==stu.id && this.age==stu.age && this.name.equals(stu.name);
	}
	public String toString(){
		return id + "	" + name + "	" + age;
	}
}
