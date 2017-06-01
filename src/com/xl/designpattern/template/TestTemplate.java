package com.xl.designpattern.template;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 
 * @version 1.0
 */

public class TestTemplate {
	public static void main(String[] args) {
		Worker it1 = new ITWorker("老扎");
		it1.workOneDay();
		Worker it2 = new ITWorker("老张");
		it2.workOneDay();
		Worker hr = new HRWorker("迪迪");
		hr.workOneDay();
		Worker qa = new QAWorker("小张");
		qa.workOneDay();
		Worker pm = new PMWorker("坑货");
		pm.workOneDay();
	}
}

