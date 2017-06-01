package com.xl.advanced.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description 实现Comparable接口，为自定义类定义排序标准
 * @version 1.0
 */
class Person2 implements Comparable{
	private int id;
	private String name;
	
	public Person2(){}
	public Person2(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2) o;
		return this.id - p.id;
	}
	@Override
	public String toString() {
		return "id: " + id + ",  name: " + name ;
	}
}
public class TestComparable {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();	//不能写成 Collection c = new ArrayList(),这会导致44行出错
		
		al.add(new Person2(1000, "zhangsan"));
		al.add(new Person2(1001, "lisi"));
		al.add(new Person2(1008, "wangwu"));
		al.add(new Person2(1003, "wugeng"));
		
		for (int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		Collections.sort(al);	//形参al必须是List类型的对象， 44行
		
		System.out.println("排序之后的内容是：");
		Iterator it = al.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}

