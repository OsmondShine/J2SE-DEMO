package com.xl.test;


/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-27
 * @description 
 * @version 1.0
 */
class MyObject{
	TestFinalize main;	//记录TestFinalize对象，在finalize中时用于恢复可达性
	
	public MyObject(TestFinalize t){
		main = t;	//保存TestFinalize对象
	}
	
	@Override
	protected void finalize() throws Throwable {
		main.ref = this;	//恢复本对象，让本对象可达
		System.out.println("This is finalize");	//用于测试finalize只运行一次
		super.finalize();
	}
}
public class TestFinalize {
	MyObject ref;
	
	public static void main(String[] args) {
		TestFinalize tf = new TestFinalize();
		tf.ref = new MyObject(tf);
		tf.ref = null;	//MyObject对象为不可达对象，finalize将被调用
		System.gc();
		if (tf.ref != null){
			System.out.println("My Object 还活着");
		}
	}
}

