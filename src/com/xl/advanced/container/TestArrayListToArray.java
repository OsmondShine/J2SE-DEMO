package com.xl.advanced.container;

import java.util.ArrayList;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description ArrayList对象中的toArray(),size()的使用
 * @version 1.0
 */
class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x=" + x + ",y=" + y;
	}
}
public class TestArrayListToArray {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(new Point(1, 1));
		a1.add(new Point(2, 2));
		a1.add(new Point(3, 3));
		System.out.println(a1);
		
		System.out.println("a1.get(2) = " + a1.get(2));
		
		Object[] objs = a1.toArray();
		for (int i=0; i<objs.length; i++){
			System.out.println(objs[i]);
		}
	}

}

