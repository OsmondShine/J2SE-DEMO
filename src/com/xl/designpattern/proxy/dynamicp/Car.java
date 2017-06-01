package com.xl.designpattern.proxy.dynamicp;

import java.util.Random;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 
 * @version 1.0
 */

public class Car implements Moveable{

	@Override
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

