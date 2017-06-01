package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-7
 * @description 
 * @version 1.0
 */

public class RunableTest implements Runnable{
	private String word;
	private int delay;
	
	public RunableTest(String whatToSay, int delayTime){
		word = whatToSay;
		delay = delayTime;
	}

	@Override
	public void run() {
		try {
			for(int i=0; i<20; i++){
				System.out.println("输出：" + word + " " + Thread.currentThread());
				//线程休眠指定时间
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public static void main(String[] args) {
		Runnable hello = new RunableTest("Hello", 33);
		Runnable world = new RunableTest("World",100);
		//构造一个指定了Runnable对象(world)的run方法,并指定线程名,启动
		new Thread(hello, "helloThread").start();
		//构造一个指定了Runnable对象(world)的run方法并启动
		new Thread(world).start();
	}
}

