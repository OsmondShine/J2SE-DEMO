package com.xl.designpattern.template;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 
 * @version 1.0
 */

public class HRWorker extends Worker{

	public HRWorker(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "看简历-打电话-接电话");
	}
	
}

