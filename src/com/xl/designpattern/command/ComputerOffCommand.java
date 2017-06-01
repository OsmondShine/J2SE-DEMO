package com.xl.designpattern.command;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 电脑关机命令类
 * @version 1.0
 */

public class ComputerOffCommand implements ICommand{
	
	private Computer computer;
	
	public ComputerOffCommand(Computer computer){
		this.computer = computer;
	}
	
	@Override
	public void execute() {
		computer.off();
	}
}

