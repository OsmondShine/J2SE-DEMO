package com.xl.advanced.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-19
 * @description 使用标识符结束线程
 * @version 1.0
 */

class A implements Runnable{
	private boolean flag = true;
	@Override
	public void run() {
		while (flag){
			System.out.println("AAAA");
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void shutDown(){
		this.flag = false;
	}
}
public class ShutThread {
	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a);
		t.start();
		
		a.shutDown();
	}
}

