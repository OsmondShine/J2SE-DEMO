package com.xl.advanced.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-19
 * @description 测试join()
 * @version 1.0
 */
/*	2017年5月19日 14:53:07	
 * 		总结：
 * 			join方法只存在于线程之间，指的是当前线程将在被调用线程执行完之后加入
 */
class MyRunner implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<50; i++){
			System.out.println("子线程MyRunner：" + i);
		}
	}
}

public class TestJoin {
	public static void main(String[] args) {
		MyRunner mr = new MyRunner();
		Thread t = new Thread(mr);
		t.start();
		
		System.out.println("当前线程信息：" + t);
		try {
			t.join();	//代表当前线程将在main线程执行完毕后加入
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

