package com.xl.designpattern.command_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("此键还没有指定相应命令哦。。。。。。。");
	}
}

