package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-5
 * @description 
 * @version 1.0
 */

public class ThreadTest extends Thread{
	private String  word;
	private int delay;
	
	public ThreadTest(String whatToSay, int delayTime){
		word = whatToSay;
		delay = delayTime;
	}

	@Override
	public void run() {
			try {
				for(int i =0; i< 20; i++){
					System.out.println(word + "当前线程名：" + Thread.currentThread());
					Thread.sleep(delay);
				} 
			}catch (InterruptedException e) {
				return;
			}
	}
	
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest("Hello", 33);
		tt.start();
		new ThreadTest("World", 100).start();
	}
}
