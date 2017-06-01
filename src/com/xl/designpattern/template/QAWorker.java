package com.xl.designpattern.template;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 
 * @version 1.0
 */

public class QAWorker extends Worker{

	public QAWorker(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "写测试用例-提交bug-写测试用例");
	}
}

