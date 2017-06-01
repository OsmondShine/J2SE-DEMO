package com.xl.advanced.container;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-17
 * @description 使用HashMap或Hashtable存储自定义类型数据
 * @version 1.0
 */
/*	
 * 	总结：若使用HashMap或Hashtable存储自定义类型数据必须重写hashCode和equals方法
 */



public class TestHash {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Map hm = new Hashtable(); 	//对于HashMap/Hashtable/HashSet而言：必须重写键类MyKey中的hashCode和equals方法，才能保证HashMap/Hashtable/HashSet中不出现重复映射
//		Map hm = new TreeMap();		//对于TreeMap而言：不必重写键类MyKey中的hashCode和equals方法
		
		hm.put(new MyKey(1003), new Person("Tom", 15));
		hm.put(new MyKey(1008),new Person("Billy",25));
		hm.put(new MyKey(1005),new Person("Kity",73));   
		hm.put(new MyKey(1001),new Person("Nancy",49));
		hm.put(new MyKey(1001),new Person("Nancy",49));
		hm.put(new MyKey(1001),new Person("Nancy",49));
		hm.put(new MyKey(1001),new Person("Nancy",49));
	
		System.out.println("----检索单个元素----");
		Person p = (Person) hm.get(new MyKey(1008));
		System.out.println(p);
		
		System.out.println("-------遍历所有元素-----");
		Set names = hm.keySet();
		Iterator it = names.iterator();
		while (it.hasNext()){
			MyKey key = (MyKey) it.next();
			Person value = (Person) hm.get(key);
			System.out.println(key.getId() + "\t" + value);
		}
		System.out.println("hm.size() = " + hm.size());
	}
}

