package com.xl.designpattern.template;

import java.util.Date;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 模版类：用于提供同用的算法步骤 	isNeedPrintDate()：是否打印日期，子类可选择重写或不重写
 * @version 1.0
 */

public abstract class Worker {
	
	protected String name;
	
	public Worker(String name){
		this.name = name;
	}
	
	//记录一天的工作
	public final void workOneDay(){
		System.out.println("------------------work start--------------");
		enterCompany();
		computerOn();
		work();
		computerOff();
		exitCompany();
		System.out.println("-------------------work end----------------");
	}
	
	//工作
	public abstract void work();
	
	//关闭电脑
	private void computerOff(){
		System.out.println(name + "关闭电脑");
	}
	
	//打开电脑
	private void computerOn(){
		System.out.println(name + "打开电脑");
	}
	
	//进入公司
	public void enterCompany(){
		System.out.println(name + "进入公司");
	}
	
	//离开公司
	public void exitCompany(){
		if (isNeedPrintDate()){
			System.out.print(new Date().toLocaleString() + "--->");
		}
		System.out.println(name + "离开公司");
	}
	
	public boolean isNeedPrintDate(){
		return false;
	}
}

