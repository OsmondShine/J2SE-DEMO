package com.xl.advanced.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-19
 * @description 使用线程建立生产者与消费者模型
 * @version 1.0
 */

class SynStack{
	private char[] data = new char[6];	//定义一个数组，用作栈，用于存放数据
	private int counter = 0;	//代表栈中有效元素个数
	private int pushCnt = 0;
	private int popCnt = 0;
	//进栈
	public synchronized void push(char value){
		while (data.length == counter){
			try {
				this.wait();	//wait是Object中的方法，不是Thread中的方法，Thread中的wait也是继承自Object
							   //this.wait();不是让当前对象wait，而是让当前锁定对象的线程wait，同时释放对this的锁定
							  //注：如果对象没有被锁定，则调用wait方法会报错，也即只有在同步代码块中才可以调用wait()和notify()/notifyAll()等方法
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		data[counter] = value;
		counter ++;
		pushCnt ++;
		
		System.out.println("生产了：" + value);
		System.out.println("容器中共有" + counter + "个字符");
		System.out.println("第" + pushCnt + "次生产");
	}
	//出栈
	public synchronized char pop(){
		while (0 == counter){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		counter --;
		popCnt ++;
		
		System.out.println("消费了：" + data[counter]);
		System.out.println("容器中共有" + counter + "个字符");
		System.out.println("第" + popCnt + "次消费");
		return data[counter];
	}
}

class Producer implements Runnable{
	private SynStack ss = null;
	private char ch;
	
	public Producer(SynStack ss) {
		this.ss = ss;
	}
	@Override
	public void run() {
		for (int i=0; i<20; i++){
			ch = (char) ('a' + i);
			ss.push(ch);
	/*		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}
class Consumer implements Runnable{
	private SynStack ss = null;
	
	public Consumer(SynStack ss) {
		this.ss = ss;
	}
	@Override
	public void run() {
		for (int i=0; i<20; i++){
			ss.pop();
		/*	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}

public class ProducerandConsumer{
	public static void main(String[] args) {
		SynStack ss = new SynStack();
		Producer p = new Producer(ss);
		Thread t1 = new Thread(p);
		t1.start();
		
		Consumer c = new Consumer(ss);
		Thread t2 = new Thread(c);
//		t2.setPriority(Thread.NORM_PRIORITY + 4);	//加大消费线程的优先级，使其具有更大的执行概率
		t2.start();
	}
}
