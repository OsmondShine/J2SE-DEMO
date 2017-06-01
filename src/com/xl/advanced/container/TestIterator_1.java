package com.xl.advanced.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-23
 * @description 使用Iterator实现对不同容器数据的输出
 * @version 1.0
 */
public class TestIterator_1 {
	//可以遍历所有Collection接口的实现类
	public static void showCollection(Collection c){
		Iterator it = c.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("one");
		al.add(22);
		al.add(new Point2(1, 1));
		System.out.println("al容器的内容是：");
		showCollection(al);
		
		HashSet hs = new HashSet();
		hs.add("one");
		hs.add(22);
		hs.add(new Point2(1, 1));
		System.out.println("hs容器的内容是：");
		showCollection(hs);
	}
}
class Point2{
	private int i, j;
	
	public Point2(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "[" + i + ", " + j + "]";
	}
}

