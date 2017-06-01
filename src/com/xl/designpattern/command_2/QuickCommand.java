package com.xl.designpattern.command_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class QuickCommand implements Command{
	
	private Command[] commands;
	
	public QuickCommand(Command[] commands){
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++){
			commands[i].execute();
		}
	}
}

