package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-7
 * @description 
 * @version 1.0
 */

public class NewRunnable {
	public NewRunnable(){
		Runnable service = new Runnable(){

			@Override
			public void run() {
				System.out.println("第一次用这种方法启动线程！");
			}
		};
		new Thread(service).start();
	}
	public static void main(String[] args) {
		new NewRunnable();
	}
}

