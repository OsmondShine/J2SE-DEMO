package com.xl.advanced.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-18
 * @description 使用多线程模拟售票点售票
 * @version 1.0
 */
/*	2017年5月18日15:56:24
 * 		总结：
 * 			在类中使用多线程的方式有两种：继承Thread或实现Runnable
 * 			1.继承Thread时，由于是使用不同的对象对资源进行访问的，若要实现对同一资源的互斥访问，
 * 			     必须为资源和锁定器加上static修饰符，以确保多个对象访问的是同一资源，锁定的是同一对象
 */
class TicketOffice extends Thread{
	private static int tickets = 100;	//static不能省
	private static Object lockObject = new Object();	//static不能省

	@Override
	public void run() {	//run方法不能加synchronized修饰，否则只能由一个线程卖票
		while(true){
			synchronized (lockObject) {
				if (tickets > 0){
					System.out.println(Thread.currentThread() + "第" + tickets + "张票正在卖出");
					tickets --;
				}else{
					break;
				}
			}
		}
	}
}

public class SaleTickets_0 {
	public static void main(String[] args) {
		TicketOffice to_1 = new TicketOffice();
		to_1.start();
		TicketOffice to_2 = new TicketOffice();
		to_2.start();
	}
}

