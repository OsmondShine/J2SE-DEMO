package com.xl.advanced.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-18
 * @description 
 * @version 1.0
 */
/*	2017年5月18日 16:21:01
 * 		总结：
 * 			实现Runnable接口实现多线程（多用）
 */
class TicketOffice1 implements Runnable{
	private int tickets = 100;
	private Object lockObject = new Object();
	
	@Override
	public void run() {
		while(true){
			synchronized (lockObject) {
				if (tickets > 0){
					System.out.println(Thread.currentThread()+"第"+tickets+"张票正在卖出");
					tickets --;
				}else{
					break;
				}
			}
		}
	}
}

public class SaleTickets_1 {
	public static void main(String[] args) {
		TicketOffice1 to = new TicketOffice1();
		Thread t1 = new Thread(to);
		t1.start();
		Thread t2 = new Thread(to);
		t2.start();
	}
}

