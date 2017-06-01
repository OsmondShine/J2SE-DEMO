package com.xl.advanced.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-19
 * @description 使用yield使当前线程让出cpu控制权，使线程有机会再次抢占cpu
 * @version 1.0
 */
class MyThread implements Runnable{
	@Override
	public void run() {
		for (int i=1; i<=1000; i++){
			System.out.println(Thread.currentThread().getName() +": " + i);
			if (0 == i%10){
				Thread.yield();
			}
		}
	}
}
public class Yield {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		
		t1.setName("线程A");
		t2.setName("线程B");
		
		t1.start();
		t2.start();
	}
}

