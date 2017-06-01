package com.xl.advanced.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-19
 * @description 
 * @version 1.0
 */

public class Syn_3 {
	public static void main(String[] args)
	{
		B aa = new B();  
		aa.start(); 
			
		try
		{
			aa.start();  //一定要明白这是主线程中的语句，这是主线程中可能会抛出的异常，此时很可能aa所对应的线程已经在执行。。。。。。。
		}
		catch (java.lang.IllegalThreadStateException e)
		{
			System.out.println("一个线程不能启动多次");
			System.out.println("一个线程不能启动多次");
			System.out.println("一个线程不能启动多次");
			System.exit(-1);
		}
		
		while (true)
		{
			System.out.println("BBBBBBBB");
		}
	}
}

class B extends Thread  //创建一个继承Thread的类
{
	public void run()  //重写Thread中的run方法
	{
		while (true)
		{
			System.out.println("AAAAAA");
		}
	}	
}

