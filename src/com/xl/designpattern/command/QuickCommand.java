package com.xl.designpattern.command;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 快速设置命令
 * @version 1.0
 */

public class QuickCommand implements ICommand{

	private ICommand[] commands;
	
	public QuickCommand(ICommand[] commands){
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++){
			commands[i].execute();
		}
	}
}

