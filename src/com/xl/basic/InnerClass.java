package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-14
 * @description 如果A类要使用B类的实例,B类要使用A类的成员，则将B类定义为A类的内部类
 * @version 1.0
 */

class Outer {
	int outer_i = 100;
	void test(){
		Inner in = new Inner();
		in.display();
	}
	
	class Inner{
		void display(){
			System.out.println("display:outer_i = " + outer_i);
		}
	}
}

public class InnerClass{
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}

