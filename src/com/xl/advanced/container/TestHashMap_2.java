package com.xl.advanced.container;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description 
 * @version 1.0
 */
class Student{
	private int id;
	private String name;
	private int age;
	
	public Student() {}

	public Student(int id, String name, int age) {
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
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.id==s.id && this.age==s.age;
	}
	@Override
	public String toString() {
		return id + "  " + name + "  " + age;
	}
}
public class TestHashMap_2 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1001, new Student(1001, "zhangsan", 20));
		hm.put(1003, new Student(1003, "lisi", 30));
		hm.put(1004, new Student(1004, "wangwu", 10));
		hm.put(1002, new Student(1002, "baichi", 20));
		
		//遍历所有元素
		System.out.println("hm容器中所有的元素是：");
		Set s = hm.keySet();
		Iterator it = s.iterator();
		while (it.hasNext()){
			int key = (Integer) it.next();
			System.out.println(hm.get(key));
		}
		
		System.out.println("直接查找某一元素");
		System.out.println(hm.get(1003));
		System.out.println(hm.get(1005));
	}
}
/*hm容器中所有的元素是：
1001  zhangsan  20
1003  lisi  30
1002  baichi  20
1004  wangwu  10
直接查找某一元素
1003  lisi  30
null*/
