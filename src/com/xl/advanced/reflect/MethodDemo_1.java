package com.xl.advanced.reflect;

import java.lang.reflect.Method;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 通过反射调用方法
 * @version 1.0
 */
/*	总结：总共分三步：1.获取类类型	2.获取方法	3.通过invoke进行方法调用
 * 
 */
public class MethodDemo_1 {
	public static void main(String[] args) {
		//要获取print(int, int)方法	1.获取一个方法，其实就是获取类的信息，获取类的信息首先要获取类的类类型
		A a1 = new A();
		Class c = a1.getClass();
		try {
			/*
			 * 2.获取方法 名称和参数列表来决定
			 * getMethod获取的是public方法
			 * getDelcaredMethod自己声明的方法
			 */
//			Method m = c.getMethod("print", new Class[]{int.class, int.class});
			Method m = c.getMethod("print", int.class, int.class);
			//3.方法的反射操作invoke	方法若无返回值，返回null,有的话，返回具体的值
			//Object obj = m.invoke(a1, new Object[]{10, 20});	//效果等同于：a1.print(10, 20)
			Object obj = m.invoke(a1, 10, 20);
			System.out.println("----------------------------------");
			Method m1 = c.getMethod("print", String.class, String.class);
			m1.invoke(a1, "hello", "world");
			//m1.invoke(a1, new Object[]{"hello", "world"});
			Method m2 = c.getMethod("print");
			m2.invoke(a1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class A{
	public void print(int a, int b) {
		System.out.println(a + b);
	}
	public void print(String a, String b){
		System.out.println(a.toUpperCase() + "," + b.toLowerCase());
	}
	public void print(){
		System.out.println("无参print。。。。。");
	}
}

