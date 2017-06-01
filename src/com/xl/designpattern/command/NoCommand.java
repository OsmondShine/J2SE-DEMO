package com.xl.designpattern.command;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class NoCommand implements ICommand {

	@Override
	public void execute() {
		System.out.println("你还没有设置对应的命令哦。。");
	}

}

